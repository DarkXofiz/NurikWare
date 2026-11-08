#version 330

in vec2 in_screen_pos;
in vec2 in_uv;
in vec4 in_color;

out vec4 out_color;

uniform sampler2D texture_in;
uniform vec2 u_source_size;
uniform vec2 u_center_px;

const float RADIUS = 72.0;
const float ZOOM = 12.0;
const float GRID_WIDTH = 1.0;
const float GRID_ALPHA = 0.15;
const float CENTER_BORDER_WIDTH = 2.0;
const float CENTER_BORDER_ALPHA = 0.7;

float lineMask(float value, float widthPx, float px) {
    return 1.0 - step(widthPx * px, value);
}

void main() {
    vec2 local = (in_uv - vec2(0.5)) * RADIUS * 2.0;
    float px = max(fwidth(local.x), fwidth(local.y));
    float dist = length(local);
    float edgeAlpha = 1.0 - smoothstep(RADIUS - px, RADIUS, dist);
    if (edgeAlpha <= 0.0) {
        discard;
    }

    vec2 sourceOffset = floor((local + vec2(ZOOM * 0.5)) / ZOOM);
    vec2 samplePx = clamp(u_center_px + sourceOffset, vec2(0.0), u_source_size - vec2(1.0));
    vec2 sampleUv = vec2(
    (samplePx.x + 0.5) / u_source_size.x,
    1.0 - (samplePx.y + 0.5) / u_source_size.y
    );

    vec3 baseColor = texture(texture_in, sampleUv).rgb * in_color.rgb;

    vec2 gridCoord = mod(local + vec2(ZOOM * 0.5), ZOOM);
    float grid = max(
    lineMask(gridCoord.x, GRID_WIDTH, px),
    lineMask(gridCoord.y, GRID_WIDTH, px)
    );

    float centerHalf = ZOOM * 0.5;
    float centerOuter = centerHalf + CENTER_BORDER_WIDTH * px;
    vec2 centerAbs = abs(local);
    float centerOuterX = 1.0 - step(centerOuter, centerAbs.x);
    float centerOuterY = 1.0 - step(centerOuter, centerAbs.y);
    float centerX = step(centerHalf, centerAbs.x) * centerOuterX * centerOuterY;
    float centerY = step(centerHalf, centerAbs.y) * centerOuterX * centerOuterY;
    float center = max(centerX, centerY);

    vec3 gridColor = mix(baseColor, vec3(1.0) - baseColor, grid * GRID_ALPHA);
    vec3 overlayColor = mix(gridColor, vec3(1.0), center * CENTER_BORDER_ALPHA);
    vec4 color = vec4(overlayColor, in_color.a * edgeAlpha);
    out_color = color;
}
