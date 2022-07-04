package controllers;

import models.Employee;
import services.EmployeeServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class FuramaControllers {
    static Scanner sc = new Scanner(System.in);
    private static void chooseOne(){
        System.out.println("1.Display list employees\n" +
                "2.Add new employee\n" +
                "3.Edit employee\n" +
                "4.Return main menu");
        System.out.println("input number you want?");
        int number = sc.nextInt();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        switch (number){
            case 1:
            case 2:

        }
    }
    private static void chooseTwo(){
        System.out.println("1.Display list customers\n" +
                "2.Add new customer\n" +
                "3.Edit customer\n" +
                "4.Return main menu");
    }
    private static void chooseThree(){
        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu");
    }
    private  static void chooseFour(){
        System.out.println("1.Add new booking\n" +
                "2.Display list booking\n" +
                "3.Create new constracts\n" +
                "4.Display list contracts\n" +
                "5.Edit contracts\n" +
                "6.Return main menu");
    }
    private  static void chooseFive(){
        System.out.println("1.Display list customers use service\n" +
                "2.Display list customers get voucher\n" +
                "3.Return main menu");
    }

    public static void main(String[] args) {

            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n " +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("Input number you want?");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    chooseOne();
                    break;
                case 2:
                    chooseTwo();
                    break;
                case 3:
                    chooseThree();
                    break;
                case 4:
                    chooseFour();
                    break;
                case 5:
                    chooseFive();
                    break;
                case 6:
                    System.exit(0);

            }
        }

    }
