#version 330

in vec4 in_pos;
in vec2 in_uv;
out vec2 out_color;

uniform sampler2D textureIn;
uniform vec2 texelSize;

vec2 jump(vec2 minSeed, inout float minDistSq, vec2 current, vec2 offset) {
    vec2 samplePos = current + offset;
    if (length(clamp(samplePos, 0, 1) - samplePos) > .0001f) {
        return minSeed;
    }
    vec2 seed = texture(textureIn, samplePos).rg;
    if (seed.x < 0.0 || seed.y < 0.0) {
        return minSeed;
    }
    vec2 size = vec2(textureSize(textureIn, 0));
    vec2 cScaled = floor(current * size);
    vec2 sScaled = floor(seed * size);
    vec2 delta = cScaled - sScaled;
    float distSq = dot(delta, delta);
    if (distSq < minDistSq) {
        minDistSq = distSq;
        return seed;
    }
    return minSeed;
}

void main() {
    vec2 jumpDist = texelSize;

    float minDistSq = 9999999;
    vec2 curr = vec2(-1);
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(0, 0));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(0, + 1));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(+ 1, + 1));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(+ 1, 0));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(+ 1, -1));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(0, -1));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(-1, -1));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(-1, 0));
    curr = jump(curr, minDistSq, in_uv, jumpDist * vec2(-1, + 1));

    out_color = curr;
}
