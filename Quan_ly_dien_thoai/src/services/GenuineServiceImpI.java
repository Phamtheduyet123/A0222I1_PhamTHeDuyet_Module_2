package services;

import fileutils.FileUtils;
import models.Genuine;
import models.Phone;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GenuineServiceImpI {
    FileUtils<Genuine> fileUtils = new FileUtils();
    List<Genuine> genuineList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    public Genuine addNew(){
        System.out.println("input phone name:");
        String phoneName = sc.nextLine();
        System.out.println("input price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("input producer:");
        String producer = sc.nextLine();
        System.out.println("input warranty Period:");
        int warrantyPeriod = Integer.parseInt(sc.nextLine());
        System.out.println("input warranty Code:");
        double warrantyCode = Double.parseDouble(sc.nextLine());
        return new Genuine(phoneName,price,producer,warrantyPeriod,warrantyCode);
    }
    public void addNewGenuine(){
        genuineList.add(addNew());
        fileUtils.writeToFile(genuineList);
        genuineList.clear();
    }
    public void displayGenuine(){
        List<Phone> result = fileUtils.getDataFromFile();
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i) instanceof Genuine){
                System.out.println(result.get(i));
            }
        }
    }
    public int getLastId() {
        int lastId;
        List<Phone> phones = fileUtils.getDataFromFile();
        if (phones.size() == 0) {
            lastId = 0;
            return lastId ;
        }
        lastId = phones.get(phones.size() - 1).getCount();
        return lastId;
    }
    public Genuine remove(int id){
        for (int i = 0; i <genuineList.size() ; i++) {
//            if(genuineList.get(i).getId() == id){
//
//                genuineList.remove(i);
//            }
        }
        return genuineList.get(id);
    }
    public void searchName(String phoneName){
        List<Phone> result = fileUtils.getDataFromFile();
        for (int i = 0; i <result.size() ; i++) {

            if(result.get(i).getPhoneName().equals(phoneName)){

                System.out.println(result.get(i).toString());
                return;
            }


        }
        System.out.println("Phone name not found");
    }

}
