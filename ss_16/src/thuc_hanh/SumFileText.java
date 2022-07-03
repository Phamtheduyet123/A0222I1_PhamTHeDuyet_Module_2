package thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class SumFileText {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        readFileText(path);

    }
    public static void readFileText(String filePath){
        try {

            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }
//‪E:\text.txt
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                int tmp  = Integer.parseInt(line.trim());
                sum+=tmp;
            }
            br.close();
            System.out.println("Tong = "+sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
