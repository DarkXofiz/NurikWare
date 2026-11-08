#version 330

in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;
uniform vec2 texel_size;

#define radius __ARG_INT__
#define weights __ARG_FLOAT_ARRAY_30__
#define direction __ARG_VEC2__

void main() {
    vec2 offset = texel_size * direction;

    vec4 color = texture(texture_in, in_uv) * weights[0];

    for (int r = 1; r <= radius; r += 2) {
        int next = r + 1;
        float w = weights[r];

        if (next <= radius) {
            float nextW = weights[next];
            float pairW = w + nextW;
            float pairOffset = (float(r) * w + float(next) * nextW) / pairW;
            vec2 o = offset * pairOffset;
            color += texture(texture_in, in_uv + o) * pairW;
            color += texture(texture_in, in_uv - o) * pairW;
        } else {
            vec2 o = offset * float(r);
            color += texture(texture_in, in_uv + o) * w;
            color += texture(texture_in, in_uv - o) * w;
        }
    }

    out_color = color;
}
