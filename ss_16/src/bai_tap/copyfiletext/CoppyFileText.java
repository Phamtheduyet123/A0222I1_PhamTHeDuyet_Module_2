package bai_tap.copyfiletext;

import java.io.*;

public class CoppyFileText {
    public void coppyFile(String source, String des) {
        try {
            File file = new File(source);
            if (!file.exists()){
               throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            FileWriter fileWriter = new FileWriter(des, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            String text = "";
            while ((line = bufferedReader.readLine()) != null) {
                text+=line+"\n";
                bufferedWriter.write(text);
            }
            bufferedReader.close();
            bufferedWriter.close();
        }catch (Exception e){
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
