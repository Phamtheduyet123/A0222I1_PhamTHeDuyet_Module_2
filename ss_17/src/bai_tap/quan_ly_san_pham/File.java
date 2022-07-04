package bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {
    static   List<Product> products = new ArrayList<>();
    public static void writeFile(List<Product> products) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\hello\\Student.abc",false))) {
            outputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> getDataFromFile(String path) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
            products = (ArrayList) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
    public static void searchFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input Id:");
        int id = sc.nextInt();
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).getId()==id ){
                System.out.println(products.get(i).toString());
            }
        }


    }
}

