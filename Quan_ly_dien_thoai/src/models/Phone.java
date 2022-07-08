package models;

public abstract class Phone {
    int count;
    String phoneName;
    double price;
    String producer;
    static int id = 0;
    public Phone() {
    }

    public Phone( String phoneName, double price, String producer) {
        this.phoneName = phoneName;
        this.price = price;
        this.producer = producer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public abstract String toData(String dilimiter);

}
