package models;

import services.GenuineServiceImpI;

public class Genuine extends Phone {
    int count;
    int warrantyPeriod;
    double warrantyCode;

    public Genuine() {
    }

    public Genuine(String phoneName, double price, String producer, int warrantyPeriod, double warrantyCode) {
        super(phoneName, price, producer);
        this.id = new GenuineServiceImpI().getLastId();
        this.id +=1;
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public Genuine(String phoneName, double price, String producer, int id, int warrantyPeriod, double warrantyCode) {
        super(phoneName, price, producer);
        this.count = id;
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(double warrantyCode) {
        this.warrantyCode = warrantyCode;
    }


    @Override
    public String toData(String dilimiter) {
        return "Genuine"+dilimiter + id + dilimiter + phoneName + dilimiter + price + dilimiter + producer + dilimiter + warrantyPeriod + dilimiter + warrantyCode;
    }

    @Override
    public String toString() {
        return "Genuine{" +
                "warrantyPeriod=" + warrantyPeriod +
                ", warrantyCode=" + warrantyCode +
                ", id=" + this.count +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }
}
