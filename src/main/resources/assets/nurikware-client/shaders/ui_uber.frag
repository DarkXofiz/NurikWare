#version 330

const int FLAG_TEXTURE = 1;
const int FLAG_RRECT = 4;
const int FLAG_STROKE = 8;
const int FLAG_SHADOW = 16;
const int FLAG_MTSDF = 32;
const int FLAG_SINGLE_CLIP = 64;
const int FLAG_BLUR = 1024;
const int TEXTURE_SLOT_MASK = 7;
const int FONT_SLOT_SHIFT = 7;
const int MAX_CLIPS = 64;

#define CLIP_USE_LOOP __ARG_BOOL__
#define BLUR_ENABLED __ARG_BOOL__

in vec2 v_pos;
in vec2 v_local;
in vec4 v_color;
flat in vec4 v_round;
flat in vec4 v_params;
flat in vec4 v_stroke_color;
flat in vec4 v_shadow_color;
flat in ivec2 v_clip_range;
flat in int v_flags;
flat in vec4 v_clip_rect;
flat in vec4 v_clip_round;

out vec4 out_color;

uniform sampler2D font_in0;
uniform sampler2D font_in1;
uniform sampler2D font_in2;
uniform sampler2D font_in3;
uniform sampler2D font_in4;
uniform sampler2D font_in5;
uniform sampler2D font_in6;
uniform sampler2D font_in7;
#if BLUR_ENABLED
uniform sampler2D blur_in;
uniform vec2 u_blur_size;
uniform vec2 u_blur_uv_scale;
#endif
#if CLIP_USE_LOOP
uniform vec4 u_clip_rects[MAX_CLIPS];
uniform vec4 u_clip_rounds[MAX_CLIPS];
#endif

const float SHADOW_QUAD_SCALE = 0.85;
const float BLUR_EDGE_INSET = 0.5;
const float RUNUP = 0.6;

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

vec3 hash32(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * vec3(0.1031, 0.1030, 0.0973));
    p3 += dot(p3, p3.yxz + 33.33);
    return fract((p3.xxy + p3.yzz) * p3.zyx);
}

bool hasFlag(int flag) {
    return (v_flags & flag) != 0;
}

float softMaxZero(float t, float k) {
    float h = max(k - abs(t), 0.0) / max(k, 1e-6);
    return max(t, 0.0) + 0.25 * k * h * h;
}

float softMaxZeroGrad(float t, float k) {
    float h = max(k - abs(t), 0.0) / max(k, 1e-6);
    return t > 0.0 ? 1.0 - 0.5 * h : 0.5 * h;
}

float sdRoundedBox(vec2 p, vec2 b, vec4 r, out vec2 grad) {
    vec2 s = step(vec2(0.0), p);
    float radius = mix(mix(r.w, r.z, s.x), mix(r.y, r.x, s.x), s.y);
    radius = clamp(radius, 0.0, min(b.x, b.y));

    vec2 q = abs(p) - b + radius;
    float kx = min(RUNUP * radius, b.x - radius);
    float ky = min(RUNUP * radius, b.y - radius);
    vec2 m = vec2(softMaxZero(q.x, kx), softMaxZero(q.y, ky));

    vec2 inner = max(q.x, q.y) < 0.0 ? (q.x >= q.y ? vec2(1.0, 0.0) : vec2(0.0, 1.0)) : vec2(0.0);
    vec2 outer = m * vec2(softMaxZeroGrad(q.x, kx), softMaxZeroGrad(q.y, ky)) / max(length(m), 1e-6);
    grad = (inner + outer) * (s * 2.0 - 1.0);

    return min(max(q.x, q.y), 0.0) + length(m) - radius;
}

vec4 premul(vec4 color) {
    return vec4(color.rgb * color.a, color.a);
}

vec4 overStraight(vec4 src, vec4 dst) {
    vec4 p = premul(src);
    return p + dst * (1.0 - p.a);
}

float pixelAA(vec2 p, vec2 grad) {
    vec2 g = vec2(dot(grad, dFdx(p)), dot(grad, dFdy(p)));
    return clamp(length(g), 0.5, 3.0);
}

float coverageRamp(float d, float aa) {
    return clamp(0.5 - d / aa, 0.0, 1.0);
}

float shapeCoverage(vec2 p, vec2 size, vec4 round) {
    vec2 halfSize = size * 0.5;
    vec2 grad;
    float d = sdRoundedBox(p, halfSize, round, grad);
    float aa = pixelAA(p, grad);
    return coverageRamp(d, aa);
}

float rectCoverage(vec2 screenPos, vec4 rect) {
    vec2 p = screenPos - rect.xy;
    vec2 insideMin = step(vec2(0.0), p);
    vec2 insideMax = step(p, rect.zw);
    return insideMin.x * insideMin.y * insideMax.x * insideMax.y;
}

float clipCoverage(vec4 clipRect, vec4 clipRound) {
    if (clipRect.z <= 0.0 || clipRect.w <= 0.0) {
        return 0.0;
    }

    if (dot(clipRound, clipRound) <= 0.0) {
        return rectCoverage(v_pos, clipRect);
    }

    vec2 size = clipRect.zw;
    vec2 p = v_pos - (clipRect.xy + size * 0.5);
    return shapeCoverage(p, size, clipRound);
}

float maskCoverage() {
    if (hasFlag(FLAG_SINGLE_CLIP)) {
        return clipCoverage(v_clip_rect, v_clip_round);
    }

    #if CLIP_USE_LOOP
    float coverage = 1.0;
    int clipCount = min(v_clip_range.y, MAX_CLIPS);
    for (int i = 0; i < clipCount; i++) {
        int clipIndex = v_clip_range.x + i;
        coverage = min(coverage, clipCoverage(u_clip_rects[clipIndex], u_clip_rounds[clipIndex]));

        if (coverage <= 0.0) {
            return 0.0;
        }
    }
    return coverage;
    #else
    return 1.0;
    #endif
}

int textureSlot() {
    return (v_flags >> FONT_SLOT_SHIFT) & TEXTURE_SLOT_MASK;
}

vec2 slotUV() {
    return mix(v_round.xy, v_round.zw, v_local);
}

vec4 sampleSlot(vec2 uv) {
    int slot = textureSlot();
    if (slot < 4) {
        if (slot < 2) {
            return slot == 0 ? texture(font_in0, uv) : texture(font_in1, uv);
        }
        return slot == 2 ? texture(font_in2, uv) : texture(font_in3, uv);
    }
    if (slot < 6) {
        return slot == 4 ? texture(font_in4, uv) : texture(font_in5, uv);
    }
    return slot == 6 ? texture(font_in6, uv) : texture(font_in7, uv);
}

vec4 renderTexture() {
    return premul(sampleSlot(slotUV()) * v_color);
}

float msdfMedian(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

vec4 renderMsdf() {
    vec2 uv = slotUV();
    vec4 texel = sampleSlot(uv);
    float sd = msdfMedian(texel.r, texel.g, texel.b);
    vec2 screenTexSize = vec2(1.0) / fwidth(uv);
    float screenPxRange = max(0.5 * dot(v_params.xy, screenTexSize), 1.0);
    float bodyCoverage = clamp((sd - 0.5) * screenPxRange + 0.5, 0.0, 1.0);

    if (!hasFlag(FLAG_STROKE)) {
        return premul(vec4(v_color.rgb, v_color.a * bodyCoverage));
    }

    float outline = min(max(v_params.z, 0.0), max(0.5 * screenPxRange - 0.5, 0.0));
    float outerCoverage = clamp((texel.a - 0.5) * screenPxRange + outline + 0.5, 0.0, 1.0);

    vec4 fill = premul(v_color) * bodyCoverage;
    vec4 stroke = premul(v_stroke_color) * outerCoverage;
    return fill + stroke * (1.0 - fill.a);
}

vec4 renderRRect() {
    vec2 shapeSize = max(v_params.xy, vec2(0.0));
    float strokeWidth = max(v_params.z, 0.0);
    float shadowRadius = max(v_params.w, 0.0);
    bool hasShadow = hasFlag(FLAG_SHADOW) && shadowRadius > 0.0;
    bool hasStroke = hasFlag(FLAG_STROKE) && strokeWidth > 0.0;
    float outerPadding = hasShadow ? shadowRadius * SHADOW_QUAD_SCALE : 0.0;
    vec2 quadSize = shapeSize + vec2(outerPadding * 2.0);
    vec2 p = v_local * quadSize - quadSize * 0.5;
    vec2 halfSize = shapeSize * 0.5;
    vec2 grad;
    float d = sdRoundedBox(p, halfSize, v_round, grad);
    float aa = pixelAA(p, grad);
    vec4 color = vec4(0.0);

    if (hasShadow) {
        float outside = max(d, 0.0);
        float falloff = 1.0 - smoothstep(0.0, shadowRadius, outside);
        float outsideMask = 1.0 - coverageRamp(d, aa);
        float shadow = falloff * falloff * outsideMask;
        vec3 dither = (hash32(gl_FragCoord.xy) - vec3(0.5)) * (shadow / 64.0);
        vec3 shadowCoverage = clamp(vec3(shadow) + dither, 0.0, 1.0);
        color = vec4(v_shadow_color.rgb * v_shadow_color.a * shadowCoverage, v_shadow_color.a * shadow);
    }

    float fillCoverage = coverageRamp(d, aa);
    vec4 fillStroke = premul(v_color);
    if (hasStroke) {
        float aaStroke = min(aa, max(strokeWidth, 0.5));
        float strokeAlpha = 1.0 - coverageRamp(d + strokeWidth, aaStroke);
        fillStroke = overStraight(vec4(v_stroke_color.rgb, v_stroke_color.a * strokeAlpha), fillStroke);
    }
    vec4 shapeColor = fillStroke * fillCoverage;
    color = shapeColor + color * (1.0 - shapeColor.a);

    return color;
}

#if BLUR_ENABLED
vec4 renderBlur() {
    vec2 shapeSize = max(v_params.xy, vec2(0.0));
    vec2 p = v_local * shapeSize - shapeSize * 0.5;
    vec2 halfSize = shapeSize * 0.5;
    vec2 grad;
    float d = sdRoundedBox(p, halfSize, v_round, grad) + BLUR_EDGE_INSET;
    float aa = pixelAA(p, grad);
    float alpha = coverageRamp(d, aa);
    if (alpha <= 0.0) {
        return vec4(0.0);
    }

    vec2 buv = vec2(v_pos.x / u_blur_size.x, 1.0 - v_pos.y / u_blur_size.y) * u_blur_uv_scale;
    vec3 blurColor = texture(blur_in, buv).rgb;
    blurColor += hash12(gl_FragCoord.xy) / 64.0;

    float outAlpha = alpha * v_color.a;
    return vec4(blurColor * v_color.rgb * outAlpha, outAlpha);
}
#endif

void main() {
    float mask = maskCoverage();
    if (mask <= 0.0) {
        discard;
    }

    vec4 color;

    #if BLUR_ENABLED
    if (hasFlag(FLAG_BLUR)) {
        color = renderBlur();
    } else
    #endif
    if (hasFlag(FLAG_MTSDF)) {
        color = renderMsdf();
    } else if (hasFlag(FLAG_TEXTURE)) {
        color = renderTexture();
    } else if (hasFlag(FLAG_RRECT)) {
        color = renderRRect();
    } else {
        color = premul(v_color);
    }

    color *= mask;

    if (color.a <= 0.0) {
        discard;
    }

    out_color = color;
}
