package bai_tap.arraylist_product;

public class Product{
    double price;
     static int id = -1;
     int count;
    String nameProduct;

    public double getPrice() {
        return price;
    }

    public int getId() {
        return count;
    }
    public int setId(int count) {
        return this.count=count;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return count == product.count;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    Product(){

    }

    public Product(String nameProduct,double price){
        id+=1;
        this.count =id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + this.count +
                ", name='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

}
