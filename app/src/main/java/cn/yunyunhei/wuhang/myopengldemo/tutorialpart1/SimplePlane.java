package cn.yunyunhei.wuhang.myopengldemo.tutorialpart1;

/**
 * Created by wuhang on 16/11/29.
 */

public class SimplePlane extends MeshVI {
    /**
     * Create a plane with a default with and height of 1 unit.
     */
    public SimplePlane() {
        this(1, 1);
    }

    /**
     * Create a plane.
     *
     * @param width  the width of the plane.
     * @param height the height of the plane.
     */
    public SimplePlane(float width, float height) {
        // Mapping coordinates for the vertices
        float textureCoordinates[] = {0.0f, 2.0f, //
                2.0f, 2.0f, //
                0.0f, 0.0f, //
                2.0f, 0.0f, //
        };

        short[] indices = new short[]{0, 1, 2, 1, 3, 2};

        float[] vertices = new float[]{-0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f,
                -0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f};

        setIndices(indices);
        setVertices(vertices);
        setTextureCoordinates(textureCoordinates);
    }
}
