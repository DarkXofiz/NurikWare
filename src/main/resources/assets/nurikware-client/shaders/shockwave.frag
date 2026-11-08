#version 330

in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D depth_texture_in;
uniform mat4 inv_mvp;
uniform mat4 mvp;
uniform vec4 wave_params;
uniform vec4 first_color;
uniform vec4 second_color;
uniform vec2 gradient_dir;
uniform float waves[40];

void main() {
    float rawDepth = texture(depth_texture_in, in_uv).r;

    if (rawDepth >= 0.99999) {
        out_color = texture(texture_in, in_uv);
        return;
    }

    vec4 clip = vec4(in_uv * 2.0 - 1.0, rawDepth * 2.0 - 1.0, 1.0);
    vec4 wp = inv_mvp * clip;
    vec3 worldRel = wp.xyz / wp.w;

    float thickness = max(wave_params.x, 0.05);
    float amplitude = wave_params.y;
    float mirrorStrength = wave_params.z;
    float aberration = wave_params.w;

    float totalDisplace = 0.0;
    float totalStrength = 0.0;
    float bestBand = 0.0;
    vec2 bestDir = vec2(0.0, 1.0);
    vec3 mirrorPos = worldRel;

    for (int i = 0; i < 8; i++) {
        int base = i * 5;
        float fade = waves[base + 4];
        if (fade <= 0.001) continue;

        vec3 center = vec3(waves[base], waves[base + 1], waves[base + 2]);
        float ringRadius = waves[base + 3];

        float dx = worldRel.x - center.x;
        float dy = worldRel.y - center.y;
        float dz = worldRel.z - center.z;
        float distXZ = max(sqrt(dx * dx + dz * dz), 1e-4);

        float ringDelta = distXZ - ringRadius;
        float gauss = exp(-(ringDelta * ringDelta) / (thickness * thickness));

        float phase = ringDelta / thickness;
        float wavy = -sin(phase * 3.14159) * gauss;

        float verticalFade = exp(-abs(dy) * 0.18) * (1.0 - smoothstep(0.1, 0.6, dy));
        float envelope = fade * verticalFade;

        totalDisplace += wavy * envelope * amplitude * 0.6;
        totalStrength += gauss * envelope;

        float band = gauss * envelope;
        if (band > bestBand) {
            bestBand = band;
            bestDir = vec2(dx, dz) / distXZ;
            float mirroredDist = max(2.0 * ringRadius - distXZ, 0.0);
            mirrorPos = vec3(center.x + bestDir.x * mirroredDist, worldRel.y, center.z + bestDir.y * mirroredDist);
        }
    }

    if (totalStrength < 0.0003) {
        out_color = texture(texture_in, in_uv);
        return;
    }

    vec3 sunkPos = worldRel + vec3(0.0, totalDisplace, 0.0);
    vec4 sunkClip = mvp * vec4(sunkPos, 1.0);

    if (sunkClip.w <= 0.0001) {
        out_color = texture(texture_in, in_uv);
        return;
    }

    vec2 sunkUV = (sunkClip.xy / sunkClip.w) * 0.5 + 0.5;

    vec2 downHere;
    {
        vec4 belowClip = mvp * vec4(worldRel + vec3(0.0, -1.0, 0.0), 1.0);
        vec2 belowUV = (belowClip.xy / belowClip.w) * 0.5 + 0.5;
        downHere = belowUV - in_uv;
        float dlen = length(downHere);
        downHere = dlen > 0.00001 ? downHere / dlen : vec2(0.0, 1.0);
    }

    float clampedStrength = min(totalStrength, 1.0);
    vec2 px = 1.0 / vec2(textureSize(texture_in, 0));
    vec2 caShift = downHere * px * clampedStrength * aberration;
    float r = texture(texture_in, sunkUV + caShift).r;
    float g = texture(texture_in, sunkUV).g;
    float b = texture(texture_in, sunkUV - caShift).b;

    vec3 color = vec3(r, g, b);

    if (mirrorStrength > 0.001 && bestBand > 0.001) {
        vec4 mirrorClip = mvp * vec4(mirrorPos, 1.0);
        if (mirrorClip.w > 0.0001) {
            vec2 mirrorUV = clamp((mirrorClip.xy / mirrorClip.w) * 0.5 + 0.5, 0.0, 1.0);
            vec3 mirrorColor = texture(texture_in, mirrorUV).rgb;
            color = mix(color, mirrorColor, min(bestBand, 1.0) * mirrorStrength);
        }
    }

    float gradient = dot(bestDir, gradient_dir) * 0.5 + 0.5;
    vec3 tint = mix(first_color.rgb, second_color.rgb, gradient);
    float tintAlpha = mix(first_color.a, second_color.a, gradient);

    color = mix(color, tint, min(bestBand, 1.0) * tintAlpha * 0.8);
    color += tint * clampedStrength * tintAlpha * 0.3;

    out_color = vec4(color, 1.0);
}