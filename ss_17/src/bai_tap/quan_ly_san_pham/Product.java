package bai_tap.quan_ly_san_pham;

import java.io.Serializable;

public class Product implements Serializable{
    static int id=-1;
    int count;
    String nameProduct;
    String manufacturer;
    double price;

    public Product() {
    }

    public int getId() {
        return count;
    }

    public void setId(int count) {
        this.count = count;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String nameProduct, String manufacturer, double price) {
    id+=1;
        this.count=id;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + count +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
