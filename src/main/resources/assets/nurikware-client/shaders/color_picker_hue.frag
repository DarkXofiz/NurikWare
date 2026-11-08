#version 330

in vec4 in_pos;
in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform vec2 u_size;

#define RUNUP 0.7

float softMaxZero(float t, float k) {
    float h = max(k - abs(t), 0.0) / max(k, 1e-6);
    return max(t, 0.0) + 0.25 * k * h * h;
}

float sdRoundedBox(vec2 p, vec2 b, float r) {
    float radius = clamp(r, 0.0, min(b.x, b.y));

    vec2 q = abs(p) - b + radius;
    float kx = min(RUNUP * radius, b.x - radius);
    float ky = min(RUNUP * radius, b.y - radius);
    vec2 m = vec2(softMaxZero(q.x, kx), softMaxZero(q.y, ky));

    return min(max(q.x, q.y), 0.0) + length(m) - radius;
}

vec3 hueToRgb(float hue) {
    vec3 rgb = abs(fract(hue + vec3(0.0, 2.0 / 3.0, 1.0 / 3.0)) * 6.0 - 3.0);
    return clamp(rgb - 1.0, 0.0, 1.0);
}

void main() {
    vec2 point = in_uv * u_size;
    vec2 p = point - u_size * 0.5;
    float radius = min(u_size.x, u_size.y) * 0.5;
    vec2 halfSize = max(u_size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, radius);
    float aa = max(fwidth(d), 0.75);
    float alpha = 1.0 - smoothstep(0.0, aa, d);

    out_color = vec4(hueToRgb(in_uv.x), alpha) * in_color;
    out_color.rgb *= out_color.a;
}
