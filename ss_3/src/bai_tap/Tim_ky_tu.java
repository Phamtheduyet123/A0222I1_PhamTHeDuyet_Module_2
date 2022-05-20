package bai_tap;

import java.util.Scanner;

public class Tim_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "nguyen hoang long";
        String key;
        System.out.print("Input character: ");
        key = sc.nextLine();
        System.out.print("Result: " + countChar(key, str));

    }

    public static int countChar(String key, String string) {
        String[] character = string.split("");
        int count = 0;
        for (int i = 0; i < character.length; i++) {
            if (character[i].equals(key)) {
                count++;
            }
        }
        return count;
    }
}
