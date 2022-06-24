package bai_tap.arraylist_product;

import java.util.Scanner;

public class TestProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        loop:
        while (true){
            System.out.println("----- Menu Product -----");
            System.out.println("1. Create\n2. Update\n3. Delete\n4. Display\n5. Search by name\n6. Sort");
            int choice = Integer.parseInt(input("Enter your choice\n "));

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                   remove();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                  sort();
                    break;
                default:
                   break loop;
            }
        }

    }
    static void create(){

        String name = input("name");
        double price = Double.parseDouble(input("Price"));
        Product product = new Product(name,price);
        productManager.create(product);
    }
    static void display(){
        productManager.display();
    }
    static void update(){
        display();
        int id = Integer.parseInt(input("Id:"));
        String name = input("name");
        double price = Double.parseDouble(input("Price"));
        Product product = new Product(name, price);
        productManager.update(product);
    }
   static void remove(){
        display();
        int id = Integer.parseInt(input("Please enter id to delete"));
        productManager.remove(id);
    }
    static void searchByName(){
        String name = input("name");
        productManager.search(name);
    }
   static void sort(){
      productManager.sort();
    }
    private static String input(String field) {
        System.out.print(field + ": ");
        return scanner.nextLine();
    }
}
