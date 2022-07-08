package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    public FacilityServiceImpl() {
    }

    double usableArea;
    double rentalCosts;
    int maximumQuantity;
    int typeRent;

    public void inputFacility() {
        usableArea = Double.parseDouble(result("usable Area"));
        rentalCosts = Double.parseDouble(result("rental Costs"));
        maximumQuantity = Integer.parseInt(result("maximum Quantity"));
        typeRent = Integer.parseInt(result("type Rent"));
    }

    public Villa addNewVilla() {
        String serviceName = "Villa";
         inputFacility();
        System.out.println("input room Standard");
        String roomStandard = sc.nextLine();
        double swimmingPoolArea = Double.parseDouble(result("swimming Pool Area"));
        int numberOfFloors = Integer.parseInt(result("number Of Floors"));
        return new Villa(serviceName,usableArea,rentalCosts,maximumQuantity,typeRent,roomStandard,swimmingPoolArea,numberOfFloors);
    }
    public House addNewHouse() {
        String serviceName = "Room";
        inputFacility();
        System.out.println("input room Standard;");
        String roomStandard = sc.nextLine();
        int numberOfFloors = Integer.parseInt(result("numberOfFloors"));
        return new House(serviceName,usableArea,rentalCosts,maximumQuantity,typeRent,roomStandard,numberOfFloors);
    }
    public Room addNewRoom() {
        String serviceName = "House";
        inputFacility();
        System.out.println("input free Service");
        String freeService = sc.nextLine();
        return new Room(serviceName,usableArea,rentalCosts,maximumQuantity,typeRent,freeService);
    }
    @Override
    public void addNewFacility() {
        int number;
        int countRoom =1;
        int countHouse =1;
        int countVilla =1;
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu");
            System.out.println("input number:");
            number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:linkedHashMap.put(addNewVilla(),countVilla++);break;
                case 2:linkedHashMap.put(addNewHouse(),countHouse++);break;
                case 3:linkedHashMap.put(addNewRoom(),countRoom++);break;
                case 4:break;
            }
        } while (number < 4);
    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> s: linkedHashMap.entrySet()) {
            if(s.getValue()>=5) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> s: linkedHashMap.entrySet()) {
            System.out.println(s);
        }
    }

    public String result(String helf) {
        System.out.println("Input " + helf);
        return sc.nextLine();
    }
}
