package thuc_hanh.he_thong_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape{
    double radius;
    Circle(){
        this.radius=1.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color,boolean filled){
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
