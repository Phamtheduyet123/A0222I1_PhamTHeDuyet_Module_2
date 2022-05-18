package thuc_hanh;

import java.util.Scanner;

public class GiaTriLonhNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr ;
        int n;
        do {
            System.out.println("input n");
            n =sc.nextInt();
           if(n<0 || n>20){
               System.out.println("sai roi!, Nhap lai:");
           }
        }while (n<0 || n>20);
        arr = new double[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextDouble();
        }
        GTLN(arr);
    }
    public static void GTLN(double arr[]){
        double max = arr[0];
        int vt =0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
                vt =i;
            }
        }
        System.out.println("Gia tri lon nhat la: "+max);
        System.out.println("Vi tri: "+(vt+1));
    }
}
