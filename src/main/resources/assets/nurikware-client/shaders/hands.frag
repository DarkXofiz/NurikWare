#version 330

in vec2 v_uv;
in vec3 v_normal;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D blurred_in;
uniform vec4 u_color;
uniform float u_mix;
uniform vec2 u_resolution;

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

void main() {
    vec4 tex = texture(texture_in, v_uv);
    if (tex.a < 0.05) {
        discard;
    }
    float gray = dot(tex.rgb, vec3(0.299, 0.587, 0.114));
    vec2 screenUv = gl_FragCoord.xy / u_resolution;
    vec2 blurUv = vec2(1.0 - screenUv.x, screenUv.y) - abs(v_normal.xy) * 0.5;
    vec3 blurred = texture(blurred_in, blurUv).rgb;
    blurred += hash12(gl_FragCoord.xy) / 64.0;
    out_color = vec4(mix(blurred, vec3(gray), u_mix), tex.a) * u_color;
}
