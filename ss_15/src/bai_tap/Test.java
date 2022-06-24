package bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        int a = sc.nextInt();
        System.out.println("input b:");
        int b = sc.nextInt();
        System.out.println("input c:");
        int c = sc.nextInt();
        try{
           new Triangle(a,b,c);

        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
