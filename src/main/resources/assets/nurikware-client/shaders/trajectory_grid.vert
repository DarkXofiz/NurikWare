#version 330

layout(location = 0) in vec3 a_center;
layout(location = 1) in float a_radius;
layout(location = 2) in vec4 a_color;

layout(std140) uniform Scene {
    mat4 projection;
    mat4 view;
} scene;

out vec4 v_color;
flat out vec3 v_center;
flat out float v_radius;

const vec3 CORNERS[8] = vec3[](
        vec3(-1.0, -1.0, -1.0),
        vec3(1.0, -1.0, -1.0),
        vec3(1.0, -1.0, 1.0),
        vec3(-1.0, -1.0, 1.0),
        vec3(-1.0, 1.0, -1.0),
        vec3(1.0, 1.0, -1.0),
        vec3(1.0, 1.0, 1.0),
        vec3(-1.0, 1.0, 1.0)
);

const int INDICES[36] = int[](
        0, 1, 3, 1, 2, 3,
        4, 7, 5, 7, 6, 5,
        3, 2, 7, 2, 6, 7,
        0, 4, 1, 4, 5, 1,
        0, 3, 4, 3, 7, 4,
        1, 5, 2, 5, 6, 2
);

void main() {
    vec3 pos = a_center + CORNERS[INDICES[gl_VertexID]] * a_radius;
    gl_Position = scene.projection * scene.view * vec4(pos, 1.0);
    v_color = a_color.bgra;
    v_center = a_center;
    v_radius = a_radius;
}