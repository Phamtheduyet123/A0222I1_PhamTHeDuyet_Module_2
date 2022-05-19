package thuc_hanh;

import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ;
        int n;
        do {
            System.out.println("input n");
            n =sc.nextInt();
            if(n<0 || n>20){
                System.out.println("sai roi!, Nhap lai:");
            }
        }while (n<0 || n>20);
        arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int min = GtNN(arr);
        System.out.println("The smallest element in the array is: " + min);
    }
    public static int GtNN(int arr[]){
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
