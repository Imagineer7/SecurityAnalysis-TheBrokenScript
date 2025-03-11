#version 150

uniform sampler2D DiffuseSampler;
uniform vec2 ScreenSize;
uniform float pixelSize; // Adjust pixelation level

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec2 pixelatedCoord = floor(texCoord * ScreenSize / pixelSize) * (pixelSize / ScreenSize);
    fragColor = texture(DiffuseSampler, pixelatedCoord);
}