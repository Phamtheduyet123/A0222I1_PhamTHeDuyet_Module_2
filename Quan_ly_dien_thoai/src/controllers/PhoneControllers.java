package controllers;

import services.GenuineServiceImpI;
import services.HandedServiceImpI;

import java.util.Scanner;

public class PhoneControllers {
    static Scanner sc = new Scanner(System.in);
    static HandedServiceImpI handedServiceImpI = new HandedServiceImpI();
    static GenuineServiceImpI genuineServiceImpI = new GenuineServiceImpI();
    private static void chooseOne() {
        int numbers;
        do {
            System.out.println("1.choose Genuine\n" +
                    "2.choose Handed\n" +
                    "3.Return menu");
            System.out.println("In put your choose");
            numbers = Integer.parseInt(sc.nextLine());
            switch (numbers) {
                case 1:
                    genuineServiceImpI.addNewGenuine();
                    break;
                case 2:
                    handedServiceImpI.addNewHanded();
                    break;
            }
        } while (numbers < 3);
    }
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Menu:\n" +
                    "1.AddNewPhone\n" +
                    "2.Display\n" +
                    "3.RemovePhone\n" +
                    "4.searchByName\n" +
                    "5.exit");
            System.out.println("Input number you want:");
            number = Integer.parseInt(sc.nextLine());
            switch (number){
                case 1:
                   chooseOne();break;
                case 2:genuineServiceImpI.displayGenuine();
                        handedServiceImpI.displayHanded();
                       break;
                case 3:
                    System.out.println("input id");
                    int id = Integer.parseInt(sc.nextLine());
                    genuineServiceImpI.remove(id);
                    handedServiceImpI.remove(id);break;
                case 4:
                    System.out.println("input name phone:");
                    String namePhone = sc.nextLine();
                    genuineServiceImpI.searchName(namePhone);
                    break;
            }
        }while (number<5);
    }

}
