package bai_tap.docfilecsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCSV {
    public static void readFile(String file) {
        try {
            File file1 = new File(file);
            if(!file1.exists()){
             throw  new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);

            }
            bufferedReader.close();
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Noi dung File:");
        readFile("C:\\Users\\Admin\\Downloads\\nation.csv");
    }
}
