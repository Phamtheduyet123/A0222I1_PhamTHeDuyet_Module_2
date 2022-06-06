package thuc_hanh.comparable;

public class Circle {
    double radius;
    String color;
    boolean filled;
    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled){
        this(radius);
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+getRadius()+", which is a subclass of "+super.toString();
    }
}
