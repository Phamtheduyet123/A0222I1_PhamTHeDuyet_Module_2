package models;

import services.GenuineServiceImpI;

public class Handed extends Phone{
    int count;
    String country;
    String status;

    public Handed() {
    }

    public Handed( String phoneName, double price, String producer, String country, String status) {
        super( phoneName, price, producer);
        this.id = new GenuineServiceImpI().getLastId();
        this.id +=1 ;
        this.country = country;
        this.status = status;
    }

    public Handed(String phoneName, double price, String producer, int id, String country, String status) {
        super(phoneName, price, producer);
        this.count = id;
        this.country = country;
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toData(String dilimiter) {
        return "Handed" + dilimiter + id + dilimiter + phoneName + dilimiter + price + dilimiter + producer + dilimiter + country + dilimiter + status;
    }

    @Override
    public String toString() {
        return "Handed{" +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                ", id=" + this.count +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }
}
