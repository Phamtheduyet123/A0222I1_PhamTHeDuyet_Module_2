package bai_tap.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager  {
    List<Product> products = new ArrayList<>();
    void create(Product product){
        products.add(product);
    }
    void update(Product product){
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).getId() == product.getId() ){
                products.set(i,product);
                break;
            }
        }
    }
    void remove(int id ){
        for (int i = 0; i <products.size(); i++) {
            if(products.get(i).getId()==id){
                products.remove(i);
            }
        }
    }
    void display(){
        for (int i = 0; i <products.size() ; i++) {
            System.out.println(products.get(i).toString());
        }
    }

    void search(String name){
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).getNameProduct().equals(name)){
                System.out.println(products.get(i).toString());
            }
        }
    }

    void sort(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });

//        Collections.sort(products, (o1,o2) -> (int)(o1.getPrice() - o2.getPrice()));
//        Collections.sort(products, Comparator.comparing(Product::getPrice));
    }
}
