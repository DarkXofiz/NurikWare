#version 330

in vec4 in_pos;
in vec2 in_uv;
out vec2 out_color;

uniform sampler2D textureIn;

void seedAt(vec2 uv, inout vec2 seed, inout float bestDistSq) {
    if (texture(textureIn, uv).a <= 0.01) {
        return;
    }
    vec2 delta = (uv - in_uv) * vec2(textureSize(textureIn, 0));
    float distSq = dot(delta, delta);
    if (distSq < bestDistSq) {
        bestDistSq = distSq;
        seed = uv;
    }
}

void main() {
    vec2 texel = 1.0 / vec2(textureSize(textureIn, 0));
    vec2 seed = vec2(-1);
    float bestDistSq = 9999999;

    seedAt(in_uv + texel * vec2(-0.5, -0.5), seed, bestDistSq);
    seedAt(in_uv + texel * vec2(0.5, -0.5), seed, bestDistSq);
    seedAt(in_uv + texel * vec2(-0.5, 0.5), seed, bestDistSq);
    seedAt(in_uv + texel * vec2(0.5, 0.5), seed, bestDistSq);

    out_color = seed;
}
