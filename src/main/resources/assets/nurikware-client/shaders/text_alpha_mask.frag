#version 330

#define CLIP_USE_LOOP __ARG_BOOL__

const int MAX_CLIPS = 64;

in vec2 in_uv;
in vec2 in_screen_pos;
in vec4 in_color;
flat in vec2 in_unit_range;
flat in vec4 in_outline_color;
out vec4 out_color;

uniform sampler2D texture_in;
uniform float u_mask_start;
uniform float u_mask_end;
uniform vec4 u_mask_start_color;
uniform vec4 u_mask_end_color;
uniform int u_clip_count;
uniform int u_clip_flags;
uniform vec4 u_clip_rect;
uniform vec4 u_clip_round;
#if CLIP_USE_LOOP
uniform vec4 u_clip_rects[MAX_CLIPS];
uniform vec4 u_clip_rounds[MAX_CLIPS];
#endif

const int CLIP_FLAG_SINGLE = 1;

#define RUNUP 0.7

const float OUTLINE_PX = 1.0;

float msdfMedian(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

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

float pixelAA(float d) {
    vec2 g = vec2(dFdx(d), dFdy(d));
    return clamp(length(g), 0.75, 1.0);
}

float rectCoverage(vec2 screenPos, vec4 rect) {
    vec2 p = screenPos - rect.xy;
    vec2 insideMin = step(vec2(0.0), p);
    vec2 insideMax = step(p, rect.zw);
    return insideMin.x * insideMin.y * insideMax.x * insideMax.y;
}

float clipShapeCoverage(vec2 p, vec2 size, vec4 round) {
    vec2 halfSize = max(size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, round);
    float aa = pixelAA(d);
    return 1.0 - smoothstep(0.0, aa, d);
}

float clipCoverage(vec4 clipRect, vec4 clipRound) {
    if (clipRect.z <= 0.0 || clipRect.w <= 0.0) {
        return 0.0;
    }

    if (dot(clipRound, clipRound) <= 0.0) {
        return rectCoverage(in_screen_pos, clipRect);
    }

    vec2 size = clipRect.zw;
    vec2 p = in_screen_pos - (clipRect.xy + size * 0.5);
    return clipShapeCoverage(p, size, clipRound);
}

float maskCoverage() {
    if ((u_clip_flags & CLIP_FLAG_SINGLE) != 0) {
        return clipCoverage(u_clip_rect, u_clip_round);
    }

    #if CLIP_USE_LOOP
    int clipCount = min(u_clip_count, MAX_CLIPS);
    if (clipCount <= 0) {
        return 1.0;
    }

    float coverage = 1.0;
    for (int i = 0; i < clipCount; i++) {
        coverage *= clipCoverage(u_clip_rects[i], u_clip_rounds[i]);

        if (coverage <= 0.0) {
            return 0.0;
        }
    }
    return coverage;
    #else
    return 1.0;
    #endif
}

void main() {
    vec4 texel = texture(texture_in, in_uv);
    float sd = msdfMedian(texel.r, texel.g, texel.b);
    vec2 screenTexSize = vec2(1.0) / fwidth(in_uv);
    float screenPxRange = max(0.5 * dot(in_unit_range, screenTexSize), 1.0);
    float bodyCoverage = clamp((sd - 0.5) * screenPxRange + 0.5, 0.0, 1.0);

    vec3 glyphRgb = in_color.rgb;
    float glyphAlpha = bodyCoverage;
    if (in_outline_color.a > 0.0) {
        float outline = min(OUTLINE_PX, max(0.5 * screenPxRange - 0.5, 0.0));
        float outerCoverage = clamp((texel.a - 0.5) * screenPxRange + outline + 0.5, 0.0, 1.0);
        glyphRgb = mix(in_outline_color.rgb, in_color.rgb, bodyCoverage);
        glyphAlpha = outerCoverage;
    }
    if (glyphAlpha <= 0.0) {
        discard;
    }

    float clip = maskCoverage();
    if (clip <= 0.0) {
        discard;
    }

    float range = max(u_mask_end - u_mask_start, 1.0);
    float amount = clamp((in_screen_pos.x - u_mask_start) / range, 0.0, 1.0);
    vec4 maskColor = mix(u_mask_start_color, u_mask_end_color, amount);
    vec4 color = vec4(glyphRgb, in_color.a) * maskColor;
    color.a *= glyphAlpha * clip;
    if (color.a <= 0.0) {
        discard;
    }

    out_color = color;
    out_color.rgb *= out_color.a;
}
