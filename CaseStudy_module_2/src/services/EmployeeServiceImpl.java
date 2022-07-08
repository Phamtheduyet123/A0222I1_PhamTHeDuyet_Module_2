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
        if(employees.size()==0){
            System.out.println("Not employees..........");
        }
        else {
            display();
        }
    }
    public Employee inputEmployee(){
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
        System.out.println("Level:");
        String level = sc.nextLine();
        System.out.println("Position:");
        String position = sc.nextLine();
        double wage = Double.parseDouble(result("Wage:"));
        return new Employee(name,dateString,gender,cmnd,phone,email,level,position,wage);
    }
    public void addEmployee(){
        addNewEmployee(inputEmployee());
    }
    @Override
    public void addNewEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public void editEmployee(Employee e,int id) {
        e.setId(id);
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).getId() == id){
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
    public void edit(){
        displayListEmployees();
        int id = Integer.parseInt(result("ID:"));
        editEmployee(inputEmployee(),id);

    }
    public String result(String helf){
        System.out.println("Input "+helf);
        return sc.nextLine();
    }
}
