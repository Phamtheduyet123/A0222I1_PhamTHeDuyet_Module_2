package bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle g = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("input side1 = ");
        double side1 = sc.nextDouble();
        System.out.println("input side2 = ");
        double side2 = sc.nextDouble();
        System.out.println("input side3 = ");
        double side3 = sc.nextDouble();
        System.out.println("input color: ");
        sc.nextLine();
        String color = sc.nextLine();
        g.setSide(side1,side2,side3);
        g.setColor(color);
        System.out.println(g.toString());
    }
}
