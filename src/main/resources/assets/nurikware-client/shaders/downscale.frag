#version 330

in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;
uniform vec2 texel_size;// 1 / source_resolution

void main() {
    vec2 o = texel_size;

    vec4 color =
    texture(texture_in, clamp(in_uv + vec2(-o.x, -o.y), 0.0, 1.0)) +
    texture(texture_in, clamp(in_uv + vec2(o.x, -o.y), 0.0, 1.0)) +
    texture(texture_in, clamp(in_uv + vec2(-o.x, o.y), 0.0, 1.0)) +
    texture(texture_in, clamp(in_uv + vec2(o.x, o.y), 0.0, 1.0));

    out_color = color * 0.25;
}
