#version 330

layout(location = 0) in vec3 a_pos;
layout(location = 1) in vec4 a_color;

out vec4 v_color;

layout(std140) uniform Scene {
    mat4 projection;
    mat4 view;
} scene;

void main() {
    gl_Position = scene.projection * scene.view * vec4(a_pos, 1.0);
    v_color = a_color.bgra;
}
