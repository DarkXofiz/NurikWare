#version 330

#define TAU 6.28318530718

in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform vec2 u_size;
uniform float u_thickness;
uniform float u_hp_progress;
uniform float u_abs_progress;
uniform vec4 u_color;
uniform vec4 u_abs_color;
uniform vec4 u_track_color;

float angleOf(vec2 p) {
    float a = atan(p.x, -p.y);
    if (a < 0.0) a += TAU;
    return a;
}

float capSdf(vec2 p, float r, float h, float ca, float square) {
    vec2 dir = vec2(sin(ca), -cos(ca));
    vec2 center = r * dir;
    if (square > 0.5) {
        vec2 a = center - dir * h;
        vec2 ba = dir * (2.0 * h);
        vec2 pa = p - a;
        float t = clamp(dot(pa, ba) / dot(ba, ba), 0.0, 1.0);
        return length(pa - ba * t);
    }
    return length(p - center) - h;
}

float arcSdf(vec2 p, float r, float h, float a0, float arcLen, float square0, float square1) {
    float da = mod(angleOf(p) - a0, TAU);
    float band = da <= arcLen ? abs(length(p) - r) - h : 1.0e6;
    float c0 = capSdf(p, r, h, a0, square0);
    float c1 = capSdf(p, r, h, a0 + arcLen, square1);
    return min(band, min(c0, c1));
}

float coverage(float d) {
    float aa = max(fwidth(d) * 0.5, 0.0001);
    return 1.0 - smoothstep(-aa, aa, d);
}

vec4 over(vec4 top, vec4 bot) {
    float a = top.a + bot.a * (1.0 - top.a);
    if (a <= 0.0) {
        return vec4(0.0);
    }
    vec3 rgb = (top.rgb * top.a + bot.rgb * bot.a * (1.0 - top.a)) / a;
    return vec4(rgb, a);
}

void main() {
    vec2 p = (in_uv - 0.5) * u_size;
    float halfMin = min(u_size.x, u_size.y) * 0.5;
    float outerR = max(halfMin - 1.0, 0.0);
    float halfThick = u_thickness * 0.5;
    float ringCenter = max(outerR - halfThick, 0.0);

    float hpLen = clamp(u_hp_progress, 0.0, 1.0) * TAU;
    float absLen = max(u_abs_progress, 0.0) * TAU;
    float junctionSquare = absLen > 0.0 ? 1.0 : 0.0;

    float covTrack = coverage(abs(length(p) - ringCenter) - halfThick);
    float covHp = coverage(arcSdf(p, ringCenter, halfThick, 0.0, hpLen, 0.0, junctionSquare));

    float covAbs = 0.0;
    if (absLen > 0.0) {
        covAbs = coverage(arcSdf(p, ringCenter, halfThick, hpLen, absLen, junctionSquare, 0.0));
    }

    if (covTrack <= 0.0 && covHp <= 0.0 && covAbs <= 0.0) {
        discard;
    }

    vec4 c = vec4(u_track_color.rgb, u_track_color.a * covTrack);
    c = over(vec4(u_color.rgb, u_color.a * covHp), c);
    c = over(vec4(u_abs_color.rgb, u_abs_color.a * covAbs), c);

    float finalAlpha = c.a * in_color.a;
    out_color = vec4(c.rgb * in_color.rgb * finalAlpha, finalAlpha);
}
