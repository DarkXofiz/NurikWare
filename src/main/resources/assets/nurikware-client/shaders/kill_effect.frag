#version 330

in vec2 v_uv;
in vec4 v_color;
out vec4 out_color;

const vec2 CENTER = vec2(0.5);
const float INV_RADIUS_SQ = 100.0;
const float INTENSITY = 1.0;
const float COLOR_BOOST = 1.5;
const vec3 BASE_COLOR = vec3(1.0);

void main() {
    vec2 d = v_uv - CENTER;
    float falloff = exp(-dot(d, d) * INV_RADIUS_SQ * 4.0);
    float alpha = min(falloff * INTENSITY, 1.0);

    vec3 color = BASE_COLOR * alpha * COLOR_BOOST * v_color.rgb;
    out_color = vec4(color, alpha * v_color.a);
}
