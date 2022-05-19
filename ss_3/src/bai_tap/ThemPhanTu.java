package bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n;
        System.out.println("Input number");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhap phan tu thu "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu muon them");
        int a = sc.nextInt();
        System.out.println("Nhap vi tri muon them");
        int vt = sc.nextInt();
        ThemPhanTu(arr,a,vt);
    }
    public static void ThemPhanTu(int[] arr, int a , int vt){
        int[] pushArr = new int[arr.length+1];
        for (int i = 0; i <pushArr.length ; i++) {
            if (i == vt) {
                pushArr[i] = a;
            } else if (i > vt) {

                pushArr[i] = arr[i-1];
            } else {

                pushArr[i] = arr[i];

            }
        }
            inMang(pushArr);
    }
    public static void inMang(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
