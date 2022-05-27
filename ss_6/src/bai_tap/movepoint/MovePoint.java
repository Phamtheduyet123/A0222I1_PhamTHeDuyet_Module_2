package bai_tap.movepoint;

public class MovePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint() {
    }

    public float getXSpeed() {
        return this.xSpeed;

    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    public MovePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        // ko hieu this nay?
        return  this;
    }

    @Override
    public String toString() {
        return super.toString()+"speed ="+getXSpeed()+getYSpeed();
    }

}
