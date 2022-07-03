package bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File implements Serializable  {
    public static void writeFile(List<Product> products) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\hello\\Student.abc"))) {
            for (Product st : products) {
                outputStream.writeObject(st.toString());
                outputStream.writeObject("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> getDataFromFile (String path) {
        List<Product> products = new ArrayList<>();
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path)))  {
            products = (ArrayList)inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}

