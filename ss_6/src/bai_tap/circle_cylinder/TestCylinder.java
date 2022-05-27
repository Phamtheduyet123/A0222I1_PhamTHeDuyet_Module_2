package bai_tap.circle_cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder s = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("input height:");
        double height = sc.nextDouble();
        System.out.println("input radius:");
        double radius = sc.nextDouble();
        s.setHeight(height);
        s.Volume();
        s.setRadius(radius);
        System.out.println(s.toString());
    }
}
