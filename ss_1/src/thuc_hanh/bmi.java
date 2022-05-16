package thuc_hanh;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        float weight, height,bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weigth");
        String weigths = sc.nextLine();
        System.out.println("Enter a heigth");
        String heigths = sc.nextLine();
        weight = Float.parseFloat(weigths);
        height = Float.parseFloat(heigths);
        bmi = weight/(height*height);
        if(bmi>=30.0){
            System.out.println("Obese");
        }
        else if(bmi>=25.0){
            System.out.println("Ovverweight");
        }
        else if(bmi>=18.5){
            System.out.println("Normal");
        }
        else {
            System.out.println("Underweight");
        }

    }
}
