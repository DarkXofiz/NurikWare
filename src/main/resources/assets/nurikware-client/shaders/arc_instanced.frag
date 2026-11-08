#version 330

noperspective in vec2 v_local;
flat in vec4 v_shape;
flat in vec2 v_rot;
flat in vec2 v_cap;
flat in float v_outline_width;
flat in vec4 v_fill_color;
flat in vec4 v_outline_color;

out vec4 out_color;

vec4 premul(vec4 color) {
    return vec4(color.rgb * color.a, color.a);
}

vec4 overStraight(vec4 src, vec4 dst) {
    vec4 p = premul(src);
    return p + dst * (1.0 - p.a);
}

void main() {
    float radius = v_shape.x;
    float halfThickness = v_shape.y;
    float rounding = v_shape.z;
    float capInset = v_shape.w;

    vec2 q = vec2(v_local.x, -v_local.y);
    q = mat2(v_rot.x, v_rot.y, -v_rot.y, v_rot.x) * q;

    float band = abs(length(q) - radius) - (halfThickness - rounding);
    float cap = capInset + rounding + abs(q.x) * v_cap.x - q.y * v_cap.y;
    float d = min(max(band, cap), 0.0) + length(max(vec2(band, cap), 0.0)) - rounding;

    float aa = max(fwidth(d), 0.0001);
    float shapeCoverage = 1.0 - smoothstep(0.0, aa, d);
    if (shapeCoverage <= 0.0) {
        discard;
    }

    vec4 color = premul(v_fill_color);
    if (v_outline_width > 0.0) {
        float strokeAlpha = smoothstep(0.0, aa, d + v_outline_width);
        color = overStraight(vec4(v_outline_color.rgb, v_outline_color.a * strokeAlpha), color);
    }
    out_color = color * shapeCoverage;
}