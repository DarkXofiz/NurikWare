#version 330

in vec4 v_color;
noperspective in vec2 v_local;
flat in float v_len;
flat in float v_half;
flat in float v_cap;

uniform float u_softness;
uniform float u_gamma;

out vec4 out_color;

void main() {
    float capExt = v_cap > 0.5 ? v_half : 0.0;

    float ax;
    if (v_local.x < 0.0) {
        ax = -v_local.x - capExt;
    } else if (v_local.x > v_len) {
        ax = v_local.x - v_len - capExt;
    } else {
        ax = -1.0e9;
    }
    float dy = abs(v_local.y) - v_half;

    vec2 q = vec2(ax, dy);
    float d = min(max(ax, dy), 0.0) + length(max(q, 0.0));

    float aa = max(fwidth(d), 0.0001) * u_softness;
    float coverage = clamp(0.5 - d / aa, 0.0, 1.0);
    coverage = pow(coverage, 1.0 / u_gamma);
    if (coverage <= 0.0) {
        discard;
    }
    out_color = vec4(v_color.rgb, v_color.a * coverage);
}
