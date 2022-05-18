package thuc_hanh;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Duyet","Hue","Lan","Huong","Phong","Nhat"};
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        boolean flg = false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(name)){
                System.out.println("Ten "+name+" vi tri thu: "+(i+1));
                flg = true;
                break;

            }
        }
        if(!flg){
            System.out.println("Khong tim thay");
        }
    }
}
