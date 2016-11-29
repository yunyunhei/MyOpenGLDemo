package cn.yunyunhei.wuhang.myopengldemo.tutorialpart1;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by wuhang on 16/11/29.
 */

public class FlatColoredSquare extends Square {
    @Override
    public void draw(GL10 gl) {
        gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
        super.draw(gl);
    }
}
