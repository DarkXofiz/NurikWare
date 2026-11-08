#version 330

in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;// background (opaque, straight alpha)
uniform sampler2D overlay_in;// foreground (premultiplied alpha)
uniform vec2 texel_size;// 1 / source_resolution

vec4 sampleSource(vec2 uv) {
    vec4 bg = texture(texture_in, uv);
    vec4 fg = texture(overlay_in, uv);
    return vec4(fg.rgb + bg.rgb * (1.0 - fg.a), 1.0);
}

void main() {
    vec2 o = texel_size;

    vec4 color =
    sampleSource(clamp(in_uv + vec2(-o.x, -o.y), 0.0, 1.0)) +
    sampleSource(clamp(in_uv + vec2(o.x, -o.y), 0.0, 1.0)) +
    sampleSource(clamp(in_uv + vec2(-o.x, o.y), 0.0, 1.0)) +
    sampleSource(clamp(in_uv + vec2(o.x, o.y), 0.0, 1.0));

    out_color = color * 0.25;
}
