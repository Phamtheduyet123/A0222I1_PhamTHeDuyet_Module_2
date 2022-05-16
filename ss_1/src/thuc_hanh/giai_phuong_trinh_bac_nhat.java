package thuc_hanh;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        double a ,b,c;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        String A = sc.nextLine();
        a = Double.parseDouble(A);
        System.out.println("b:");
        String B = sc.nextLine();
        b = Double.parseDouble(B);
        System.out.println("C:");
        String C = sc.nextLine();
        c = Double.parseDouble(C);
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        else {
            if(b==c){
                System.out.print("The solution is all x!");
            }
            else {
                System.out.print("No solution!");
            }
        }
    }
}
