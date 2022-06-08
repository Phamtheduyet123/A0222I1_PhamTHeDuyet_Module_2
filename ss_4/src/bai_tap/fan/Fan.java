package bai_tap.fan;

public class Fan {
    final private int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String coler = "blue";

    Fan() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.coler;
    }

    public void setColor(String coler) {
        this.coler = coler;
    }

    public String toString1() {
        if (getOn()) {
            return "fan is on" + getOn() + getSpeed() + getRadius() + getColor();
        } else {
            return "fan is off" + getColor() + getRadius();
        }
    }
}
