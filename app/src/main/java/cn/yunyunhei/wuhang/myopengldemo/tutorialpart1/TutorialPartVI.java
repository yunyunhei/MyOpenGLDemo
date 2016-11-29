package cn.yunyunhei.wuhang.myopengldemo.tutorialpart1;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import cn.yunyunhei.wuhang.myopengldemo.R;

/**
 * Created by wuhang on 16/11/29.
 */

public class TutorialPartVI extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove the title bar from the window.
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Make the windows into full screen mode.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Create a OpenGL view.
        GLSurfaceView view = new GLSurfaceView(this);

        // Creating and attaching the renderer.
        OpenGLRenderVI renderer = new OpenGLRenderVI();
        view.setRenderer(renderer);
        setContentView(view);

        // Create a new plane.
        SimplePlane plane = new SimplePlane(1, 1);

        // Move and rotate the plane.
        plane.z = 1.7f;
        plane.rx = -65;

        // Load the texture.
        plane.loadBitmap(BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher));

        // Add the plane to the renderer.
        renderer.addMesh(plane);
    }
}
