#version 120

varying highp vec2 textureCoordinate;
uniform sampler2D inputImageTexture;
uniform lowp float mirrorstart;
uniform lowp float orientation;//方向，上1.0 下2.0 左3.0 右4.0
highp vec2 mirrorPoint;

void main() {
    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);
    if(orientation == 1.0){
         if(textureCoordinate.y > mirrorstart){
             mirrorPoint = vec2(textureCoordinate.x, 2.0 * mirrorstart - textureCoordinate.y);
             lowp vec4 texture = texture2D(inputImageTexture, mirrorPoint);
             gl_FragColor = vec4(texture.r, texture.g, texture.b, texture.a);
         }else{
             gl_FragColor = vec4(textureColor.r,textureColor.g,textureColor.b,textureColor.a);
         }
    }else if(orientation == 2.0){
         if(textureCoordinate.y < mirrorstart){
             mirrorPoint = vec2(textureCoordinate.x, 2.0 * mirrorstart - textureCoordinate.y);
             lowp vec4 texture = texture2D(inputImageTexture, mirrorPoint);
             gl_FragColor = vec4(texture.r, texture.g, texture.b, texture.a);
         }else{
             gl_FragColor = vec4(textureColor.r,textureColor.g,textureColor.b,textureColor.a);
         }
    }else if(orientation == 3.0){
         if(textureCoordinate.x > mirrorstart){
             mirrorPoint = vec2(2.0 * mirrorstart - textureCoordinate.x, textureCoordinate.y);
             lowp vec4 texture = texture2D(inputImageTexture, mirrorPoint);
             gl_FragColor = vec4(texture.r, texture.g, texture.b, texture.a);
         }else{
             gl_FragColor = vec4(textureColor.r,textureColor.g,textureColor.b,textureColor.a);
         }
    }else if(orientation == 4.0){
         if(textureCoordinate.x < mirrorstart){
             mirrorPoint = vec2(2.0 * mirrorstart - textureCoordinate.x, textureCoordinate.y);
             lowp vec4 texture = texture2D(inputImageTexture, mirrorPoint);
             gl_FragColor = vec4(texture.r, texture.g, texture.b, texture.a);
         }else{
             gl_FragColor = vec4(textureColor.r,textureColor.g,textureColor.b,textureColor.a);
         }
   }
}
