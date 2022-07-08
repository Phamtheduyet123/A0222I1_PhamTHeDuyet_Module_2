package fileutils;


import models.Genuine;
import models.Handed;
import models.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils<E extends Phone> {
   private   final String DILIMITER = ";";
   public  void writeToFile(List<E> phone){
       try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\hello\\duyet.txt",true))) {

           for (Phone phones:phone) {
               bufferedWriter.write(phones.toData(DILIMITER));
               bufferedWriter.write("\n");
           }
       }catch (IOException e){
          e.printStackTrace();
       }
   }
   public  List getDataFromFile(){
       List phones = new ArrayList<>();
       try( BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\hello\\duyet.txt"))){
          String line = "";
          while ((line = bufferedReader.readLine() )!=null){
              if(line.isEmpty()){
                  continue;
              }
              String[] result = line.split(DILIMITER);
              if(result[0].equals("Genuine")){
                 int id = Integer.parseInt(result[1]);
                  String phoneName = result[2];
                  double price = Double.parseDouble(result[3]);
                  String producer = result[4];
                  int warrantyPeriod = Integer.parseInt(result[5]);
                  double warrantyCode = Double.parseDouble(result[6]);
                   phones.add(new Genuine(phoneName,price,producer,id,warrantyPeriod,warrantyCode));
              }
              else {
                  int id = Integer.parseInt(result[1]);
                  String phoneName = result[2];
                  double price = Double.parseDouble(result[3]);
                  String producer = result[4];
                 String country = result[5];
                String status = result[6];
                  phones.add(new Handed(phoneName,price,producer,id,country,status));
              }
          }
       }catch (IOException e){
           e.printStackTrace();
       }
        return phones;
   }
}
