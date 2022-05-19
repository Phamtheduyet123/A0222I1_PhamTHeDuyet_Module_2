package bai_tap;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        float[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("input hang:");
        int m = sc.nextInt();
        System.out.println("input cot:");
        int n = sc.nextInt();
        arr = new float[m][n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu ["+i+","+j+"]");
                arr[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Nhap vao vi tri cot muon tinh tong:");
        int k = sc.nextInt();
        float total = 0.0f;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(j==(k-1)) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("Tong cot "+k+" la: "+total);
    }
}
