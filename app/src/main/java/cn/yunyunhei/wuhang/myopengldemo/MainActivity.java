package cn.yunyunhei.wuhang.myopengldemo;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private GLSurfaceView mEffectView;

    private TextureRenderer renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEffectView = (GLSurfaceView) findViewById(R.id.glSurfaceView);

        renderer = new TextureRenderer();
        renderer.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.avatar));
        renderer.setCurrentEffect(R.id.none);

        mEffectView.setEGLContextClientVersion(2);
        mEffectView.setRenderer(renderer);
        mEffectView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        renderer.setCurrentEffect(item.getItemId());
        mEffectView.requestRender();
        return true;
    }
}
