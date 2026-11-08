#version 330

in vec2 in_uv;
in vec4 in_color;
flat in vec2 in_unit_range;
flat in vec4 in_outline_color;
out vec4 out_color;

uniform sampler2D texture_in;

const float OUTLINE_PX = 1.0;

float msdfMedian(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

void main() {
    if (in_unit_range.x <= 0.0) {
        out_color = in_color;
        return;
    }

    vec4 texel = texture(texture_in, in_uv);
    vec2 screenTexSize = vec2(1.0) / fwidth(in_uv);
    float screenPxRange = max(0.5 * dot(in_unit_range, screenTexSize), 1.0);

    float bodySd = msdfMedian(texel.r, texel.g, texel.b);
    float bodyCoverage = clamp((bodySd - 0.5) * screenPxRange + 0.5, 0.0, 1.0);

    if (in_outline_color.a <= 0.0) {
        float coverage = in_color.a * bodyCoverage;
        if (coverage <= 0.0) {
            discard;
        }
        out_color = vec4(in_color.rgb, coverage);
        return;
    }

    float outline = min(OUTLINE_PX, max(0.5 * screenPxRange - 0.5, 0.0));
    float outerCoverage = clamp((texel.a - 0.5) * screenPxRange + outline + 0.5, 0.0, 1.0);

    float fillA = in_color.a * bodyCoverage;
    float strokeA = in_outline_color.a * outerCoverage;
    float outA = fillA + strokeA * (1.0 - fillA);
    if (outA <= 0.0) {
        discard;
    }

    vec3 rgb = (in_color.rgb * fillA + in_outline_color.rgb * strokeA * (1.0 - fillA)) / outA;
    out_color = vec4(rgb, outA);
}
