package thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;
public class HCN {
    public static void main(String[] args) {
        double width ,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        width = sc.nextDouble();
        System.out.print("Enter the height:");
        height = sc.nextDouble();
        Rectangle c = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+c.getArea());
        System.out.println("Perimeter of the Rectangle: "+c.getPerimeter());
        System.out.println("Area of the Rectangle: "+c.diplay());
    }
}
