#version 330

in vec4 in_pos;
in vec4 in_color;
in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D texture_jf;
uniform float radius;
uniform float time;

float noise(vec2 point) {
    return fract(sin(dot(point, vec2(12.9898, 78.233))) * 43758.5453);
}

float seedDistance(vec2 seed, vec2 pixel, vec2 size) {
    if (seed.x < 0.0 || seed.y < 0.0) {
        return 9999999.0;
    }
    return distance(pixel, floor(seed * size));
}

vec2 bestSeed(vec2 uv, vec2 pixel, vec2 size) {
    vec2 texel = 1.0 / vec2(textureSize(texture_jf, 0));
    vec2 best = vec2(-1);
    float bestDist = 9999999.0;

    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            vec2 seed = texture(texture_jf, uv + texel * vec2(x, y)).rg;
            float dist = seedDistance(seed, pixel, size);
            if (dist < bestDist) {
                bestDist = dist;
                best = seed;
            }
        }
    }

    return best;
}

void main() {
    vec2 size = vec2(textureSize(texture_in, 0));
    vec2 pixel = floor(in_uv * size);
    vec2 seed = bestSeed(in_uv, pixel, size);
    float dist = seedDistance(seed, pixel, size);

    float seedValid = 1.0 - step(9999998.0, dist);
    float innerFade = smoothstep(1.0, 5.0, dist);
    float outerFade = 1.0 - smoothstep(radius - 2.0, radius + 2.0, dist);
    float entityMask = 1.0 - step(0.01, texture(texture_in, in_uv).a);
    float wave = max(0.0, sin(dist + time));
    float noiseAlpha = mix(0.94, 1.06, noise(gl_FragCoord.xy + vec2(time * 17.0, time * 31.0)));
    float alpha = seedValid * wave * innerFade * outerFade * entityMask * noiseAlpha;

    out_color = vec4(vec3(1), alpha) * in_color;
}
