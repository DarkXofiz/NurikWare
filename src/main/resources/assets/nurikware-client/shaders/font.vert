#version 330

layout(location = 0) in vec4 a_rect;
layout(location = 1) in vec4 a_uv;
layout(location = 2) in vec4 a_color;
layout(location = 3) in vec2 a_unitRange;
layout(location = 4) in vec4 a_outline_color;

out vec2 in_uv;
out vec4 in_color;
flat out vec2 in_unit_range;
flat out vec4 in_outline_color;

uniform mat4 u_projection;

const vec2 CORNERS[6] = vec2[](
vec2(0.0, 0.0),
vec2(0.0, 1.0),
vec2(1.0, 1.0),
vec2(0.0, 0.0),
vec2(1.0, 1.0),
vec2(1.0, 0.0)
);

void main() {
    vec2 corner = CORNERS[gl_VertexID];
    vec2 rectSize = a_rect.zw - a_rect.xy;
    vec2 pos = a_rect.xy + rectSize * corner;
    vec2 uv = mix(a_uv.xy, a_uv.zw, corner);

    gl_Position = u_projection * vec4(pos, 0.0, 1.0);
    in_uv = uv;
    in_color = a_color.bgra;
    in_unit_range = a_unitRange;
    in_outline_color = a_outline_color.bgra;
}
