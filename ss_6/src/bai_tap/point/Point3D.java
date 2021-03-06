package bai_tap.point;

public class Point3D extends Point2D{
    float z = 0.0f;
    Point3D(){}
    Point3D(float x, float y , float z){
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y ,float z) {
        this.x = x;
        this.y= y;
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0]= this.x;
        arr[1] = this.y;
        arr[2] =this.z;
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+"z = "+z;
    }
}
