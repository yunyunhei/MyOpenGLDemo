package cn.yunyunhei.wuhang.myopengldemo.wuwang.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.View;

/**
 * @author WuHang 2018/6/14 0014
 **/
public abstract class Shape implements GLSurfaceView.Renderer {

    protected View mView;

    public Shape(View mView){
        this.mView=mView;
    }

    protected int loadShader(int type, String shaderCode) {
        //根据type创建顶点着色器或者片元着色器
        int shader = GLES20.glCreateShader(type);
        //将资源加入到着色器中，并编译
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
