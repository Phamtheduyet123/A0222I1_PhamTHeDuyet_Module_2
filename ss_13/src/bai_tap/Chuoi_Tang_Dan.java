package bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Chuoi_Tang_Dan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = sc.nextLine();
        List<Character> max = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> characters = new ArrayList<>();
            characters.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j)>characters.get(characters.size()-1)){
                    characters.add(string.charAt(j));
                }
            }
            if(characters.size()>max.size()){
                max.clear();
                max.addAll(characters);
            }
            characters.clear();
        }
        for (Character a: max
             ) {
            System.out.print(a);
        }

    }
}
