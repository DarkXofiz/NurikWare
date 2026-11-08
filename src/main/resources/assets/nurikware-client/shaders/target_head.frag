#version 330

#define RUNUP 0.7

in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform sampler2D texture_in;
uniform vec2 u_size;
uniform float u_radius;

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

float pixelAA(float d) {
    vec2 g = vec2(dFdx(d), dFdy(d));
    return clamp(length(g), 0.75, 1.0);
}

vec2 pixelSnapUv(vec2 uv, vec2 regionOrigin, vec2 atlasSize) {
    vec2 pixel = uv * 8.0;
    vec2 boxSize = clamp(fwidth(pixel), 1e-5, 1.0);
    vec2 tx = pixel - 0.5 * boxSize;
    vec2 txOffset = smoothstep(vec2(1.0) - boxSize, vec2(1.0), fract(tx));
    return (regionOrigin + floor(tx) + 0.5 + txOffset) / atlasSize;
}

void main() {
    vec2 p = in_uv * u_size - u_size * 0.5;
    vec2 halfSize = max(u_size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, u_radius);
    float aa = pixelAA(d);
    float coverage = 1.0 - smoothstep(0.0, aa, d);
    if (coverage <= 0.0) {
        discard;
    }

    vec2 baseUv = pixelSnapUv(in_uv, vec2(8.0), vec2(64.0));
    vec2 hatUv  = pixelSnapUv(in_uv, vec2(40.0, 8.0), vec2(64.0));

    vec4 base = texture(texture_in, baseUv);
    vec4 hat  = texture(texture_in, hatUv);

    vec3 basePma = base.rgb * base.a;
    vec3 hatPma  = hat.rgb * hat.a;
    vec3 outPma  = hatPma + basePma * (1.0 - hat.a);
    float outA   = hat.a + base.a * (1.0 - hat.a);
    vec3 outRgb  = outA > 0.0001 ? outPma / outA : vec3(0.0);

    float finalAlpha = outA * coverage * in_color.a;
    out_color = vec4(outRgb * in_color.rgb * finalAlpha, finalAlpha);
}
