package services;

import fileutils.FileUtils;
import models.Genuine;
import models.Handed;
import models.Phone;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HandedServiceImpI {
    FileUtils<Handed> fileUtils = new FileUtils();
    List<Handed> handedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public Handed addNew() {
        System.out.println("input phone name:");
        String phoneName = sc.nextLine();
        System.out.println("input price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("input producer:");
        String producer = sc.nextLine();
        System.out.println("input country:");
      String country = sc.nextLine();
        System.out.println("input status:");
        String status = sc.nextLine();
        return new Handed(phoneName, price, producer,country,status);
    }

    public void addNewHanded(){
        handedList.add(addNew());
        fileUtils.writeToFile(handedList);
        handedList.clear();
    }

    public void displayHanded(){
        List<Phone> result = fileUtils.getDataFromFile();
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i) instanceof Handed){
                System.out.println(result.get(i));
            }
        }
    }

    public Handed remove(int id) {
        for (int i = 0; i < handedList.size(); i++) {
//            if (handedList.get(i).getId() == id) {
//
//                handedList.remove(i);
//            }
        }
        return handedList.get(id);
    }

    public void searchName(String phoneName) {
        for (Handed handed : handedList) {
            if (handed.getPhoneName() == phoneName) {
                handed.toString();
            } else {
                System.out.println("Phone name not found");
            }
        }
    }
}
