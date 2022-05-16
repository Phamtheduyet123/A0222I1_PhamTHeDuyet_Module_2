package bai_tap;

import java.util.Scanner;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
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
            }
            if(i>100-1){
                break;
            }
            i++;
        }
    }
}
