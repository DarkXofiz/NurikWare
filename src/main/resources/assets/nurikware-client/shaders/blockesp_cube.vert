#version 330

layout(location = 0) in vec3 a_offset;
layout(location = 1) in vec4 a_color;

out vec4 v_color;

layout(std140) uniform Scene {
    mat4 projection;
    mat4 view;
} scene;

const vec3 EDGES[24] = vec3[](
        vec3(0.0, 0.0, 0.0), vec3(1.0, 0.0, 0.0),
        vec3(1.0, 0.0, 0.0), vec3(1.0, 0.0, 1.0),
        vec3(1.0, 0.0, 1.0), vec3(0.0, 0.0, 1.0),
        vec3(0.0, 0.0, 1.0), vec3(0.0, 0.0, 0.0),
        vec3(0.0, 1.0, 0.0), vec3(1.0, 1.0, 0.0),
        vec3(1.0, 1.0, 0.0), vec3(1.0, 1.0, 1.0),
        vec3(1.0, 1.0, 1.0), vec3(0.0, 1.0, 1.0),
        vec3(0.0, 1.0, 1.0), vec3(0.0, 1.0, 0.0),
        vec3(0.0, 0.0, 0.0), vec3(0.0, 1.0, 0.0),
        vec3(1.0, 0.0, 0.0), vec3(1.0, 1.0, 0.0),
        vec3(1.0, 0.0, 1.0), vec3(1.0, 1.0, 1.0),
        vec3(0.0, 0.0, 1.0), vec3(0.0, 1.0, 1.0)
);

void main() {
    gl_Position = scene.projection * scene.view * vec4(EDGES[gl_VertexID] + a_offset, 1.0);
    v_color = a_color.bgra;
}
