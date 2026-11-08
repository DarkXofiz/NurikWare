#version 330

in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D depth_texture_in;
uniform mat4 inv_mvp;
uniform vec3 u_center;
uniform float u_band_y;
uniform vec2 u_dir_vel;
uniform float u_time;
uniform float u_alpha;

const float BAND_HALF = 0.02;
const float WAVE_AMP = 0.03;
const float TRAIL_LEN = 0.5;
const float TRAIL_STRENGTH = 0.5;
const float GLOW_LEN = 0.12;
const float GLOW_STRENGTH = 0.6;
const float AMBIENT_LEN = 0.55;
const float AMBIENT_STRENGTH = 0.12;
const float HOT_MIX = 0.7;

void main() {
    float mask = texture(texture_in, in_uv).a;
    float rawDepth = texture(depth_texture_in, in_uv).r;
    if (mask < 0.01 || rawDepth >= 0.99999) {
        discard;
    }

    vec4 clip = vec4(in_uv * 2.0 - 1.0, rawDepth * 2.0 - 1.0, 1.0);
    vec4 wp = inv_mvp * clip;
    vec3 pos = wp.xyz / wp.w;

    vec2 radial = pos.xz - u_center.xz;
    float theta = atan(radial.y, radial.x);
    float wave = WAVE_AMP * (sin(theta * 3.0 + u_time * 2.6) + 0.45 * sin(theta * 5.0 - u_time * 3.4));
    float d = pos.y - (u_band_y + wave);
    float dist = abs(d);

    float core = 1.0 - smoothstep(BAND_HALF * 0.7, BAND_HALF, dist);
    float hot = 1.0 - smoothstep(BAND_HALF * 0.25, BAND_HALF * 0.45, dist);
    float glow = exp(-dist / GLOW_LEN) * GLOW_STRENGTH;
    float ambient = exp(-dist / AMBIENT_LEN) * AMBIENT_STRENGTH;

    float trail = 0.0;
    float behind = -d * u_dir_vel.x - BAND_HALF;
    if (behind > 0.0) {
        float trailLen = TRAIL_LEN * (0.25 + 0.75 * u_dir_vel.y);
        trail = (1.0 - clamp(behind / trailLen, 0.0, 1.0)) * TRAIL_STRENGTH;
    }

    vec3 hotColor = mix(in_color.rgb, vec3(1.0), HOT_MIX);
    vec3 result = in_color.rgb * (core + glow + ambient + trail) + hotColor * hot;
    out_color = vec4(result, in_color.a * u_alpha);
}