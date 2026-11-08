#version 330

layout(location = 0) in vec4 a_geometry;
layout(location = 1) in vec4 a_arc;
layout(location = 2) in float a_cap_inset;
layout(location = 3) in vec4 a_fill_color;
layout(location = 4) in vec4 a_outline_color;

uniform mat4 u_projection;
uniform mat4 u_view;

noperspective out vec2 v_local;
flat out vec4 v_shape;
flat out vec2 v_rot;
flat out vec2 v_cap;
flat out float v_outline_width;
flat out vec4 v_fill_color;
flat out vec4 v_outline_color;

const vec2 CORNERS[6] = vec2[](
        vec2(-1.0, -1.0),
        vec2(1.0, -1.0),
        vec2(1.0, 1.0),
        vec2(-1.0, -1.0),
        vec2(1.0, 1.0),
        vec2(-1.0, 1.0)
);

void main() {
    vec2 corner = CORNERS[gl_VertexID];
    float radius = a_geometry.z;
    float halfThickness = a_geometry.w * 0.5;
    float extent = radius + halfThickness + 1.5;
    v_local = corner * extent;
    gl_Position = u_projection * u_view * vec4(a_geometry.xy + v_local, 0.0, 1.0);

    float mid = (a_arc.x + a_arc.y) * 0.5;
    float halfArc = (a_arc.y - a_arc.x) * 0.5;
    v_shape = vec4(radius, halfThickness, min(a_arc.z, halfThickness), a_cap_inset);
    v_rot = vec2(cos(mid), sin(mid));
    v_cap = vec2(cos(halfArc), sin(halfArc));
    v_outline_width = a_arc.w;
    v_fill_color = a_fill_color.bgra;
    v_outline_color = a_outline_color.bgra;
}