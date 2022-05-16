package bai_tap;

import java.util.Scanner;

public class snt_dau_tien_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number prime");
        int number = sc.nextInt();
        int dem =0;
        int i=2;
        while (true){
            boolean flg = true;
           for (int j = 2; j <=Math.sqrt(i) ; j++) {
               if(i%j==0){
                   flg = false;
               }
           }
           if(flg){
               System.out.println(i+" ");
               dem++;
           }
           if(dem>number-1){
               break;
           }
           i++;
       }
    }
}
