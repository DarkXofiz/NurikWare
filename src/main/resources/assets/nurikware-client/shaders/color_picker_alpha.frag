#version 330

in vec4 in_pos;
in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform vec2 u_size;
uniform vec4 u_color;

const vec3 CHECKER_DARK = vec3(0.3607843, 0.3607843, 0.3607843);
const vec3 CHECKER_LIGHT = vec3(0.7882353, 0.7882353, 0.7882353);

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

void main() {
    vec2 point = in_uv * u_size;
    vec2 p = point - u_size * 0.5;
    float radius = min(u_size.x, u_size.y) * 0.5;
    vec2 halfSize = max(u_size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, radius);
    float aa = max(fwidth(d), 0.75);
    float shapeAlpha = 1.0 - smoothstep(0.0, aa, d);

    float cellSize = max(u_size.y * 0.5, 1.0);
    float checkerIndex = mod(floor(point.x / cellSize) + floor(point.y / cellSize), 2.0);
    vec3 checker = mix(CHECKER_DARK, CHECKER_LIGHT, checkerIndex);
    vec3 rgb = mix(checker, u_color.rgb, in_uv.x);

    out_color = vec4(rgb, shapeAlpha) * in_color;
    out_color.rgb *= out_color.a;
}
