package thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public static List<Integer> readFile(String file) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file1 = new File(file);
            if (!file1.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String line = "";
            while ((line = br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public static int findmax(List<Integer> number){
        int max = number.get(0);
        for (int i = 1; i <number.size() ; i++) {
            if(max<number.get(i))
                max = number.get(i);
        }
        return max;
    }
    public static void writeFile(String filePath , int max){
        try{
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Gia tri lon nhat la "+max);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FindMax readAndWriteFile = new FindMax();
        List<Integer> number = readAndWriteFile.readFile("E:\\hello\\abcddddddd.txt");
        int maxValue = findmax(number);
        readAndWriteFile.writeFile("E:\\result.txt",maxValue);
    }
}
