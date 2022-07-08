package models;

import java.util.Date;

public class Employee extends Person{
    static int count ;
    static {
        count=-1;
    }
    int id;
    String level;
    String position;
    double wage;

    public Employee() {
    }

    public Employee(String level, String position, double wage) {
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String name, String dateOfBirth, String gender, double CMND, double phoneNumber, String email, String level, String position, double wage) {
        super(name, dateOfBirth, gender, CMND, phoneNumber, email);
        count+=1;
        this.id=count;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", CMND=" + CMND +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
