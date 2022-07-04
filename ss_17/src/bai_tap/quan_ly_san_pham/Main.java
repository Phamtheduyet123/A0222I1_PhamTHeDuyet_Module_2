package bai_tap.quan_ly_san_pham;

import thuc_hanh.doc_ghi_file_sinh_vien.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static  List<Product> products  = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Menu: 1.Add" +
                "2.Display" +
                "3.Search" +
                "4.Exit");
        int number;
        do {
            System.out.println("Input your choose:");
             number = sc.nextInt();
             sc.nextLine();
            switch (number) {
                case 1:
                    add();
                    break;
                case 2:
                    diplayFile();
                    break;
                case 3:
                    searchFile();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (number<5);
    }
    public static void add(){
        System.out.println("Input name product:");
        String nameProduct = sc.nextLine();
        System.out.println("Input manufacturer:");
        String manufacturer = sc.nextLine();
        System.out.println("Input price:");
        String price = sc.nextLine();
        double prices = Double.parseDouble(price);
        products.add(new Product(nameProduct,manufacturer,prices));
        File.writeFile(products);
    }
    public static void diplayFile(){
        List<Product> result =  File.getDataFromFile("E:\\hello\\Student.abc");
        result.stream().forEach(System.out::println);
    }
    public static void searchFile(){
        File.searchFile();
    }
}
