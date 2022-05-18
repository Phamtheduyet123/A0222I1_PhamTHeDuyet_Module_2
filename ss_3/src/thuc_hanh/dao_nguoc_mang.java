package thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n;
    //    n = sc.nextInt();
//        while (n<0 || n>20){
//        System.out.println("Input n");
//        n = sc.nextInt();
//        }
        while (true){
            System.out.println("Input n");
            n = sc.nextInt();
            if(n>0 && n<20){
                break;
             }
       }
        arr = new int[n];

       for(int i=0;i<arr.length; i++){
           System.out.println("inmut number "+(i+1));
        arr[i] = sc.nextInt();
       }
       daoMang(arr);
       inMang(arr);
    }
    public static void daoMang(int arr[]){
        for(int i=0; i<arr.length/2; i++){
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[arr.length - (i + 1)];
                arr[arr.length - (i + 1)] = temp;
        }
    }
    public static void inMang(int arr[]){
        System.out.println("Mang sau khi dao la:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
