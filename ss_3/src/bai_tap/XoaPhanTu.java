package bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr;
        int[] tempArr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhap phan tu thu"+(i+1));
            arr[i] = sc.nextInt();
        }
        tempArr = new int[arr.length-1];
        System.out.println("Nhap phan tu can xoa:");
        int k = sc.nextInt();
        xoaMang(arr,tempArr,k);
        System.out.println("Mangsau khi xoa la:");
        for (int i = 0; i <tempArr.length ; i++) {
            System.out.println(tempArr[i]+" ");
        }

    }
    public static void xoaMang(int arr[],int tempArr[], int k){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==k){
                for (int j = i; j <arr.length-1 ; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        for (int i = 0; i <tempArr.length ; i++) {
            tempArr[i] = arr[i];
        }
    }

}
