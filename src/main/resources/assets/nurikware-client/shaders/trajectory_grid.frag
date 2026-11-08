#version 330

in vec4 v_color;
flat in vec3 v_center;
flat in float v_radius;
out vec4 out_color;

uniform sampler2D depth_in;
uniform vec2 texel_size;
uniform mat4 invProjection;
uniform mat4 invView;

const float BAYER[16] = float[16](
        0.0, 8.0, 2.0, 10.0,
        12.0, 4.0, 14.0, 6.0,
        3.0, 11.0, 1.0, 9.0,
        15.0, 7.0, 13.0, 5.0
);

vec3 reconstructWorldPosition(vec2 uv, float depth) {
    float z = depth * 2.0 - 1.0;

    vec4 clipPos = vec4(uv * 2.0 - 1.0, z, 1.0);

    vec4 viewPos = invProjection * clipPos;
    viewPos /= viewPos.w;

    vec4 worldPos = invView * viewPos;
    return worldPos.xyz;
}

float bayer4x4(vec2 fragCoord) {
    ivec2 cell = ivec2(mod(fragCoord, 4.0));
    return (BAYER[cell.y * 4 + cell.x] + 0.5) / 16.0;
}

void main() {
    if (gl_FrontFacing) {
        discard;
    }
    vec2 uv = gl_FragCoord.xy * texel_size;
    vec3 worldPos = reconstructWorldPosition(uv, texture(depth_in, uv).r);
    vec3 local = worldPos - v_center;
    float dist = length(local);
    if (dist > v_radius) {
        discard;
    }
    float strength = 1.0 - smoothstep(v_radius - 1.0, v_radius, dist);
    if (bayer4x4(gl_FragCoord.xy) > strength * 0.5) {
        discard;
    }
    float edgeBoost = smoothstep(v_radius - 2.0, v_radius - 1.0, dist) * 0.1;
    out_color = vec4(v_color.rgb, v_color.a * (0.6 + edgeBoost));
}