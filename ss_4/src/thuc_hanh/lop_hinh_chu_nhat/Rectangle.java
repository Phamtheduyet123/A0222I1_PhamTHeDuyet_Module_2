package thuc_hanh.lop_hinh_chu_nhat;

public class Rectangle {
    double width,height;
    Rectangle(){

    }
    Rectangle(double width, double height){
    this.width = width;
    this.height = height;
    }
    public double getArea(){
    return this.width*this.height;
    }
    public double getPerimeter(){
        return this.getArea()*this.getArea();
    }
    public String diplay(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
