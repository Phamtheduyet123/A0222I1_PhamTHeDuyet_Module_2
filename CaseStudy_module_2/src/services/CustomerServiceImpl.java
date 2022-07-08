package services;

import models.Customer;
import models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    Scanner sc = new Scanner(System.in);
    public List<Customer> customers = new LinkedList<>();
    public CustomerServiceImpl(){
    }
    public void displayListCustomer(){
        if(customers.size()==0){
            System.out.println("Not customer...........");
        }
        else {
            display();
        }
    }
    public Customer inputCustomer(){
        System.out.println("Input Name:");
        String name = sc.nextLine();
        System.out.println("Input Date Of Birth:");
        String dateString = sc.nextLine();
        System.out.println("Gender(true/false)");
        String gender = sc.nextLine();
        double cmnd = Double.parseDouble(result("CMND:"));
        double phone = Double.parseDouble(result("Phone number:"));
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("type of guest:");
        String typeOfGuest = sc.nextLine();
        System.out.println("address:");
        String address = sc.nextLine();
        return new Customer(name,dateString,gender,cmnd,phone,email,typeOfGuest,address);
    }
    public void addCustomer(){
        addNewCustomer(inputCustomer());
    }


    @Override
    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void editCustomer(Customer e, int id) {
        e.setId(id);
        for (int i = 0; i <customers.size() ; i++) {
            if(customers.get(i).getId() == id){
               customers.set(i,e);
            }
        }
    }



    @Override
    public void display() {
        for (int i = 0; i <customers.size() ; i++) {
            System.out.println(customers.get(i));
        }
    }
    public void edit(){
        displayListCustomer();
        int id = Integer.parseInt(result("ID:"));
        editCustomer(inputCustomer(),id);

    }
    public String result(String helf){
        System.out.println("Input "+helf);
        return sc.nextLine();
    }
}
