package bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class CanBacHai {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("ax^2+bx+c=0 \n");
        System.out.println("input a =");
        a = sc.nextDouble();
        System.out.println("input b =");
        b = sc.nextDouble();
        System.out.println("input c =");
        c = sc.nextDouble();
       QuadraticEquation s = new QuadraticEquation(a,b,c);
        if(s.getDiscriminant()>0){
            System.out.println("x1 = "+s.getRoot1());
            System.out.println("\n x2 = "+s.getRoot2());
        }
        else if(s.getDiscriminant()==0){
            System.out.println("x1 = x2 = "+(-b/(2*a)));
        }
        else {
            System.out.println("The equation has no roots");
        }
    }

}
