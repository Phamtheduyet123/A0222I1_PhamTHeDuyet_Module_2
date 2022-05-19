package bai_tap;

import java.util.Scanner;

public class TinhTOngDuongCHeo {
    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        int m = sc.nextInt();
        int n = m;
        arr = new int[m][n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu ["+i+","+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total +=arr[i+j][j];
            }
            int temp = 0;
            for (int j = arr[i].length-1 ; j >=0; j--) {
                total +=arr[i+temp++][j];
            }
            break;
        }
        System.out.println("Tong:"+total);
    }
}
