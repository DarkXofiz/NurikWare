#version 330

layout(location = 0) in vec4 a_origin_edge_x;
layout(location = 1) in vec2 a_edge_y;
layout(location = 2) in vec4 a_color;
layout(location = 3) in vec4 a_round;
layout(location = 4) in vec4 a_params;
layout(location = 5) in vec4 a_stroke_color;
layout(location = 6) in vec4 a_shadow_color;
layout(location = 7) in ivec2 a_clip_range;
layout(location = 8) in int a_flags;
layout(location = 9) in vec4 a_clip_rect;
layout(location = 10) in vec4 a_clip_round;

out vec2 v_pos;
out vec2 v_local;
out vec4 v_color;
flat out vec4 v_round;
flat out vec4 v_params;
flat out vec4 v_stroke_color;
flat out vec4 v_shadow_color;
flat out ivec2 v_clip_range;
flat out int v_flags;
flat out vec4 v_clip_rect;
flat out vec4 v_clip_round;

uniform mat4 u_projection;

const vec2 CORNERS[6] = vec2[](
vec2(1.0, 0.0),
vec2(0.0, 0.0),
vec2(0.0, 1.0),
vec2(1.0, 0.0),
vec2(0.0, 1.0),
vec2(1.0, 1.0)
);

void main() {
    vec2 corner = CORNERS[gl_VertexID];
    vec2 origin = a_origin_edge_x.xy;
    vec2 pos = origin + a_origin_edge_x.zw * corner.x + a_edge_y * corner.y;

    v_pos = pos;
    v_local = corner;
    v_color = a_color.bgra;
    v_round = a_round;
    v_params = a_params;
    v_stroke_color = a_stroke_color.bgra;
    v_shadow_color = a_shadow_color.bgra;
    v_clip_range = a_clip_range;
    v_flags = a_flags;
    v_clip_rect = a_clip_rect;
    v_clip_round = a_clip_round;
    gl_Position = u_projection * vec4(pos, 0.0, 1.0);
}
