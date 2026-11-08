#version 330

in vec4 in_pos;
in vec2 in_uv;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D depth_texture_in;
uniform float alpha;
uniform float sky_protection;

void main() {
    out_color = texture(texture_in, in_uv);
    float gray = dot(out_color.rgb, vec3(0.299, 0.587, 0.114));
    float sky = sky_protection * step(0.999999, texture(depth_texture_in, in_uv).r);
    out_color = vec4(mix(out_color.rgb, vec3(gray), alpha * (1.0 - sky)), out_color.a);
}
