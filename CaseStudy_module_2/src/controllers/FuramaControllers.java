package controllers;

import models.Employee;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class FuramaControllers {
    static Scanner sc = new Scanner(System.in);
    private static void chooseOne() {
        int number ;
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu");
            System.out.println("input number you want?");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    employeeService.displayListEmployees();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.edit();
                    break;
            }
        }while (number<4);
    }
    private static void chooseTwo(){
        int number ;
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu");
            System.out.println("input number you want?");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    customerService.displayListCustomer();
                    break;
                case 2:
                   customerService.addCustomer();
                    break;
                case 3:
                   customerService.edit();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }while (number<5);
    }
    private static void chooseThree() {
        int number;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu");
            System.out.println("input number you want?");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }while (number<5);
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
        int number;
        do {
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("Input number you want?");
            number = sc.nextInt();
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
        }while (number<6);
        }

    }
