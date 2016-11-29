package cn.yunyunhei.wuhang.myopengldemo.tutorialpart1;

import java.util.Vector;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by wuhang on 16/11/29.
 */

public class GroupVI extends MeshVI{
    private final Vector<MeshVI> mChildren = new Vector<MeshVI>();

    @Override
    public void draw(GL10 gl) {
        int size = mChildren.size();
        for (int i = 0; i < size; i++)
            mChildren.get(i).draw(gl);
    }

    /**
     * @param location
     * @param object
     * @see java.util.Vector#add(int, java.lang.Object)
     */
    public void add(int location, MeshVI object) {
        mChildren.add(location, object);
    }

    /**
     * @param object
     * @return
     * @see java.util.Vector#add(java.lang.Object)
     */
    public boolean add(MeshVI object) {
        return mChildren.add(object);
    }

    /**
     * @see java.util.Vector#clear()
     */
    public void clear() {
        mChildren.clear();
    }

    /**
     * @param location
     * @return
     * @see java.util.Vector#get(int)
     */
    public MeshVI get(int location) {
        return mChildren.get(location);
    }

    /**
     * @param location
     * @return
     * @see java.util.Vector#remove(int)
     */
    public MeshVI remove(int location) {
        return mChildren.remove(location);
    }

    /**
     * @param object
     * @return
     * @see java.util.Vector#remove(java.lang.Object)
     */
    public boolean remove(Object object) {
        return mChildren.remove(object);
    }

    /**
     * @return
     * @see java.util.Vector#size()
     */
    public int size() {
        return mChildren.size();
    }
}
