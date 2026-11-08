#version 330

layout(location = 0) in vec3 a_pos;
layout(location = 1) in float a_radius;
layout(location = 2) in vec4 a_color;

out vec2 v_uv;
out vec4 v_color;

uniform mat4 u_projection;
uniform mat4 u_view;

const vec2 CORNERS[6] = vec2[](
vec2(-1.0, -1.0),
vec2(1.0, -1.0),
vec2(1.0, 1.0),
vec2(-1.0, -1.0),
vec2(1.0, 1.0),
vec2(-1.0, 1.0)
);

const vec2 UVS[6] = vec2[](
vec2(0.0, 0.0),
vec2(1.0, 0.0),
vec2(1.0, 1.0),
vec2(0.0, 0.0),
vec2(1.0, 1.0),
vec2(0.0, 1.0)
);

void main() {
    vec2 corner = CORNERS[gl_VertexID];
    vec4 viewCenter = u_view * vec4(a_pos, 1.0);
    vec4 viewPos = viewCenter + vec4(corner * a_radius, 0.0, 0.0);
    gl_Position = u_projection * viewPos;
    v_uv = UVS[gl_VertexID];
    v_color = a_color.bgra;
}
