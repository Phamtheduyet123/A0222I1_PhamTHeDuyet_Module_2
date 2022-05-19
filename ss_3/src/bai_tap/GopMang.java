package bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[];
        int arr2[];
        System.out.println("Input n1");
        int n1 = sc.nextByte();
        arr1 = new int[n1];
        System.out.println("Input n2");
        int n2 = sc.nextByte();
        arr2 = new int[n2];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("input n:");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("input n:");
            arr2[i] = sc.nextInt();
        }
        gopMang(arr1,arr2);
    }
    public static void gopMang(int[] arr1, int[] arr2){
        Scanner sc = new Scanner(System.in);
        int arr3[];
        arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
                arr3[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        inMang(arr3);
    }
    public static void inMang(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
