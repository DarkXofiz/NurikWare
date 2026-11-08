#version 330

#define CLIP_USE_LOOP __ARG_BOOL__
#define RUNUP 0.7
#define BLUR_EDGE_INSET 0.5

const int MAX_CLIPS = 64;

in vec2 in_uv;
in vec2 in_screen_pos;
in vec4 in_color;

out vec4 out_color;

uniform sampler2D texture_in;
uniform vec2 u_size;
uniform vec2 u_pos;
uniform vec4 u_round;
uniform int u_clip_count;
uniform int u_clip_flags;
uniform vec4 u_clip_rect;
uniform vec4 u_clip_round;
#if CLIP_USE_LOOP
uniform vec4 u_clip_rects[MAX_CLIPS];
uniform vec4 u_clip_rounds[MAX_CLIPS];
#endif

const int CLIP_FLAG_SINGLE = 1;

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
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

float shapeCoverage(vec2 p, vec2 size, vec4 round) {
    vec2 halfSize = max(size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, round);
    float aa = pixelAA(d);
    return 1.0 - smoothstep(0.0, aa, d);
}

float insetShapeCoverage(vec2 p, vec2 size, vec4 round, float inset) {
    vec2 halfSize = max(size * 0.5 - vec2(0.5), vec2(0.0));
    float d = sdRoundedBox(p, halfSize, round) + inset;
    float aa = pixelAA(d);
    return 1.0 - smoothstep(0.0, aa, d);
}

float rectCoverage(vec2 screenPos, vec4 rect) {
    vec2 p = screenPos - rect.xy;
    vec2 insideMin = step(vec2(0.0), p);
    vec2 insideMax = step(p, rect.zw);
    return insideMin.x * insideMin.y * insideMax.x * insideMax.y;
}

float clipCoverage(vec2 screenPos, vec4 clipRect, vec4 clipRound) {
    if (clipRect.z <= 0.0 || clipRect.w <= 0.0) {
        return 0.0;
    }

    if (dot(clipRound, clipRound) <= 0.0) {
        return rectCoverage(screenPos, clipRect);
    }

    vec2 size = clipRect.zw;
    vec2 p = screenPos - (clipRect.xy + size * 0.5);
    return shapeCoverage(p, size, clipRound);
}

float maskCoverage(vec2 screenPos) {
    if ((u_clip_flags & CLIP_FLAG_SINGLE) != 0) {
        return clipCoverage(screenPos, u_clip_rect, u_clip_round);
    }

    #if CLIP_USE_LOOP
    if (u_clip_count <= 0) {
        return 1.0;
    }

    float coverage = 1.0;
    for (int i = 0; i < MAX_CLIPS; i++) {
        if (i >= u_clip_count) {
            break;
        }
        coverage *= clipCoverage(screenPos, u_clip_rects[i], u_clip_rounds[i]);
    }
    return coverage;
    #else
    return 1.0;
    #endif
}

void main() {
    vec2 local = in_screen_pos - u_pos;
    vec2 p = local - u_size * 0.5;
    float alpha = insetShapeCoverage(p, u_size, u_round, BLUR_EDGE_INSET);

    if (alpha <= 0.0) {
        discard;
    }
    vec3 blurColor = texture(texture_in, vec2(in_uv.x, 1-in_uv.y)).rgb;
    float dither = hash12(gl_FragCoord.xy) / 64.0;
    blurColor += dither;
    float mask = maskCoverage(in_screen_pos);
    float outAlpha = alpha * mask * in_color.a;
    out_color = vec4(blurColor * in_color.rgb * outAlpha, outAlpha);
}
