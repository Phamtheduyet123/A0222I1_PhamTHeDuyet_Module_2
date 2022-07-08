package models;

import java.util.Date;

public class Customer extends Person {
    static int count ;
    static {
        count =-1;
    }
    int id;
    String typeOfGuest;
    String address;
    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer( String name, String dateOfBirth, String gender, double CMND, double phoneNumber, String email, String typeOfGuest, String address) {
        super(name, dateOfBirth, gender, CMND, phoneNumber, email);
        count+=1;
        this.id=count;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                ", id=" +id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", CMND=" + CMND +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
