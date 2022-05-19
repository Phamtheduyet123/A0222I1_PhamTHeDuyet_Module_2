package bai_tap;

import java.util.Scanner;

public class PhanTuLonNHat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr ;
        System.out.println("Nhap va hang:");
        int m = sc.nextByte();
        System.out.println("Nhap vao cot");
        int n = sc.nextInt();
        arr = new int[m][n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("Nhap vao phan tu ["+i+","+j+"]");
                arr[i][j] =sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("So lon nhat trong mang 2 chieu la: "+ max);
    }
}
