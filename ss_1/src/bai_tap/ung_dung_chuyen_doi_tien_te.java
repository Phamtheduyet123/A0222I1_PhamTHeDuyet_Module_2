package bai_tap;

import java.nio.FloatBuffer;
import java.util.Random;
import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        final float RATE = 23000f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD");
        int money = sc.nextInt();
        float VND = money/RATE;
        System.out.println(VND+"VND");
    }
}
