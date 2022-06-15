package bai_tap.stack_dao_nguoc_mang;

import java.util.Scanner;
import java.util.Stack;

public class Test_Dao_Mang {
    public static void main(String[] args) {
        DaoNguocMang<Integer> arrayList = new DaoNguocMang<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println("Mang truoc khi dao la:");
        arrayList.inMangStack();
        arrayList.daoMang();
        System.out.println("\nMang sau khi dao la:");
        arrayList.printl();
        Scanner sc = new Scanner(System.in);
        DaoNguocMang<Character> arr = new DaoNguocMang<>();
        System.out.println("\n nhap chuoi:");
        String str = sc.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            arr.add(str.charAt(i));
        }
        arr.daoMang();
        arr.printl();
    }
}
