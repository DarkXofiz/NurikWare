#version 330

in vec4 in_pos;
in vec2 in_uv;
in vec4 in_color;
out vec4 out_color;

uniform sampler2D texture_in;

vec3 hash32(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * vec3(0.1031, 0.1030, 0.0973));
    p3 += dot(p3, p3.yxz + 33.33);
    return fract((p3.xxy + p3.yzz) * p3.zyx);
}

void main() {
    vec4 color = in_color * texture(texture_in, in_uv);
    color.rgb += (hash32(gl_FragCoord.xy) - 0.5) / 255.0;
    out_color = color;
}
