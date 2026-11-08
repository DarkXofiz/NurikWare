#version 330

in vec4 in_pos;
in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform vec2 u_size;
uniform float u_radius;
uniform float u_border_width;
uniform vec4 u_top_left;
uniform vec4 u_top_right;
uniform vec4 u_bottom_left;
uniform vec4 u_bottom_right;
uniform vec4 u_border_color;

#define RUNUP 0.7

float softMaxZero(float t, float k) {
    float h = max(k - abs(t), 0.0) / max(k, 1e-6);
    return max(t, 0.0) + 0.25 * k * h * h;
}

float sdRoundedBox(vec2 p, vec2 b, vec4 r) {
    float radius = p.x > 0.0 ? (p.y > 0.0 ? r.x : r.z) : (p.y > 0.0 ? r.y : r.w);
    radius = clamp(radius, 0.0, min(b.x, b.y));

    vec2 q = abs(p) - b + radius;
    float kx = min(RUNUP * radius, b.x - radius);
    float ky = min(RUNUP * radius, b.y - radius);
    vec2 m = vec2(softMaxZero(q.x, kx), softMaxZero(q.y, ky));

    return min(max(q.x, q.y), 0.0) + length(m) - radius;
}

float shapeCoverage(vec2 p, vec2 size, vec4 round) {
    vec2 halfSize = max(size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, round);
    float aa = max(fwidth(d), 0.75);
    return 1.0 - smoothstep(0.0, aa, d);
}

float noise(vec2 point) {
    return fract(sin(dot(point, vec2(12.9898, 78.233))) * 43758.5453);
}

void main() {
    vec2 point = in_uv * u_size;
    vec2 p = point - u_size * 0.5;
    vec4 round = vec4(u_radius);
    vec2 halfSize = max(u_size * 0.5 - vec2(0.5), vec2(0.0));
    float distance = sdRoundedBox(p, halfSize, round);
    float alpha = shapeCoverage(p, u_size, round);

    vec4 top = mix(u_top_left, u_top_right, in_uv.x);
    vec4 bottom = mix(u_bottom_left, u_bottom_right, in_uv.x);
    vec4 color = mix(top, bottom, in_uv.y);

    float grain = (noise(point) - 0.5) / 255.0;
    color.rgb = clamp(color.rgb + grain, 0.0, 1.0);

    float aa = max(fwidth(distance), 0.75);
    float strokeAlpha = smoothstep(0.0, aa, distance + u_border_width);
    color = mix(color, u_border_color, strokeAlpha);

    out_color = vec4(color.rgb, color.a * alpha) * in_color;
    out_color.rgb *= out_color.a;
}
