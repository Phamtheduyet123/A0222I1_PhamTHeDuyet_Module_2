package bai_tap.circle_cylinder;

public class Circle {
    double radius ;
     String color;
    final double PI = 3.14;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Circle(){

    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Circle with radius of "+getRadius()+" and color"+getColor();
    }
}
