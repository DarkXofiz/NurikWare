#version 330

layout(location = 0) in vec3 a_start;
layout(location = 1) in vec3 a_end;
layout(location = 2) in vec4 a_colorA;
layout(location = 3) in vec4 a_colorB;
layout(location = 4) in float a_cap;

layout(std140) uniform Scene {
    mat4 projection;
    mat4 view;
} scene;

uniform vec2 u_viewport;
uniform float u_width;
uniform float u_softness;

out vec4 v_color;
noperspective out vec2 v_local;
flat out float v_len;
flat out float v_half;
flat out float v_cap;

const vec2 CORNERS[6] = vec2[](
vec2(0.0, -1.0),
vec2(1.0, -1.0),
vec2(1.0, 1.0),
vec2(0.0, -1.0),
vec2(1.0, 1.0),
vec2(0.0, 1.0)
);

void main() {
    vec2 corner = CORNERS[gl_VertexID];

    mat4 vp = scene.projection * scene.view;
    vec4 clipA = vp * vec4(a_start, 1.0);
    vec4 clipB = vp * vec4(a_end, 1.0);

    vec2 halfViewport = u_viewport * 0.5;
    vec2 screenA = (clipA.xy / clipA.w) * halfViewport;
    vec2 screenB = (clipB.xy / clipB.w) * halfViewport;

    vec2 dir = screenB - screenA;
    float len = length(dir);
    dir = len > 0.0001 ? dir / len : vec2(1.0, 0.0);
    vec2 normal = vec2(-dir.y, dir.x);

    float halfWidth = max(u_width, 0.0) * 0.5;
    float margin = u_softness * 0.5 + 0.5;
    float halfExtent = halfWidth + margin;
    float extend = step(0.5, a_cap) * (halfWidth + margin);
    float alongSign = corner.x * 2.0 - 1.0;

    vec4 clip = mix(clipA, clipB, corner.x);
    vec2 base = mix(screenA, screenB, corner.x);
    vec2 screenPos = base + normal * (corner.y * halfExtent) + dir * (alongSign * extend);

    vec2 ndc = screenPos / halfViewport;
    gl_Position = vec4(ndc * clip.w, clip.z, clip.w);

    v_color = mix(a_colorA, a_colorB, corner.x).bgra;
    v_local = vec2(corner.x * len + alongSign * extend, corner.y * halfExtent);
    v_len = len;
    v_half = halfWidth;
    v_cap = a_cap;
}
