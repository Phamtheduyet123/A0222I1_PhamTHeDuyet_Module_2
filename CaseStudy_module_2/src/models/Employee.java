package models;

import java.util.Date;

public class Employee extends Person{
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

    public Employee(int id, String name, Date dateOfBirth, boolean gender, int CMND, int phoneNumber, String email, String level, String position, double wage) {
        super(id, name, dateOfBirth, gender, CMND, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
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
