package bai_tap.quan_ly_san_pham;

import thuc_hanh.doc_ghi_file_sinh_vien.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products  = new ArrayList<>();
        products.add(new Product(0,"Smartphone","Apple",20000000));
        products.add(new Product(1,"SamSung Galaxy ultra 10","SamSung",10000000));
        products.add(new Product(2,"Iphone X","Apple",30000000));
        products.add(new Product(3,"Nokia","Nokia",200000));
        File.writeFile(products);
        Scanner sc = new Scanner(System.in);
       List<Product> result =  File.getDataFromFile("E:\\hello\\Student.abc");
       result.stream().forEach(System.out::println);
    }
}
