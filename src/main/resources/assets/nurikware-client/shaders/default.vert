#version 330

layout(location=0) in vec3 pos;
layout(location=1) in vec2 uv;
layout(location=2) in vec4 color;

out vec4 in_pos;
out vec2 in_screen_pos;
out vec2 in_uv;
out vec4 in_color;

uniform mat4 u_projection;
uniform mat4 u_view;

void main() {
    in_uv = uv;
    in_screen_pos = pos.xy;
    in_pos = u_projection * u_view * vec4(pos, 1.0);
    gl_Position = in_pos;
    in_color = color.bgra;
}
