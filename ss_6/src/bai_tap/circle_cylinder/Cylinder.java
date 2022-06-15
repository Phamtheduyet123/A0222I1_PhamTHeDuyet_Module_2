package bai_tap.circle_cylinder;

public class Cylinder extends Circle{
  double height;
    Cylinder(){

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double height,double radius, String color){
        this.height=height;
        this.radius = radius;
        this.color = color;
    }
    public double Volume(){
        return super.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "+getHeight()+" and Volume = "+Volume()+",which is a subclass of "
                + super.toString();
    }
}
