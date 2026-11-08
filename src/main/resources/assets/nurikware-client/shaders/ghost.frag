#version 330

in vec2 v_uv;
in vec2 v_light;
in vec4 v_color;
out vec4 out_color;

uniform sampler2D texture_in;
uniform sampler2D lightmap_in;
uniform vec4 u_color;

void main() {
    vec4 tex = texture(texture_in, v_uv);
    if (tex.a < 0.1) {
        discard;
    }
    float lum = dot(tex.rgb * v_color.rgb, vec3(0.2126, 0.7152, 0.0722));
    vec3 light = texture(lightmap_in, v_light).rgb;
    out_color = vec4(u_color.rgb * lum * light, tex.a * v_color.a * u_color.a);
}
