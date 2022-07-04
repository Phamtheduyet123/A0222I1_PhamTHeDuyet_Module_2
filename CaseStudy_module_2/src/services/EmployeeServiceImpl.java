package services;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    Scanner sc = new Scanner(System.in);

    public List<Employee> employees = new ArrayList<>();
    public EmployeeServiceImpl(){
    }
    public void displayListEmployees(){
        if(employees.size()<0){
            System.out.println("Not employees");
        }
        else {
            display();
        }
    }
    public void addEmployee(){
        System.out.println("Input ID:");
        int id = sc.nextInt();
        System.out.println("\nInput Name:");
        String name = sc.nextLine();
        System.out.println("Input Date Of Birth:");

        System.out.println("Gender(true/false)");
        boolean gender = false;
        System.out.println("Input CMND:");
        double cmnd = sc.nextDouble();
        System.out.println("Phone number:");
        double phone = sc.nextDouble();
        System.out.println("Email:");
        String email = sc.nextLine();
        addNewEmployee(new Employee(id,));

    }
    @Override
    public void addNewEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public void editEmployee(Employee e) {
    display();
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).getId() == e.getId()){
                employees.set(i,e);
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i <employees.size() ; i++) {
            System.out.println(employees.get(i));
        }
    }
}
