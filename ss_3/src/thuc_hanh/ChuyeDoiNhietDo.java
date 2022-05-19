package thuc_hanh;

import java.util.Scanner;

public class ChuyeDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        double celsius, fahrenheit;
        do {
            System.out.println("1. Fahrenheit to Celsius\n" +
                    "\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "\n" +
                    "0. Exit ");
            System.out.println("Choose number:");
             number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Input Fahrenheit");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input Fahrenheit");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + CelsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (number!=0);
    }
    public static double fahrenheitToCelsius( double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
    public static double CelsiusToFahrenheit( double celsius){
        return (9.0/5)*celsius+32;
    }
}
