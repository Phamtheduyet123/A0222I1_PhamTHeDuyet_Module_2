package bai_tap.arraylist;

import java.util.List;
import java.util.Objects;

public class Product{
    double price;
    int id;
    String nameProduct;

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    Product(){

    }
    public Product(int id,String nameProduct,double price){
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

}
