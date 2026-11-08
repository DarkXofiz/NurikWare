#version 330

layout(location = 0) in vec3 a_pos;
layout(location = 1) in vec2 a_uv;
layout(location = 2) in vec3 a_normal;

out vec2 v_uv;
out vec3 v_normal;

uniform mat4 u_projection;
uniform mat4 u_view;

void main() {
    gl_Position = u_projection * u_view * vec4(a_pos, 1.0);
    v_uv = a_uv;
    v_normal = normalize(mat3(u_view) * a_normal);
}