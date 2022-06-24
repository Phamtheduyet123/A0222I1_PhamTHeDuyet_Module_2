package bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optional_Chuoi_Con_Dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");//abcabcdgabxy
        String string = sc.nextLine();
        List<Character> max = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        for (int i = 1; i < string.length(); i++) {
            if(characters.size()==0){
                characters.add(string.charAt(i-1));
            }
            if (string.charAt(i)>characters.get(characters.size()-1)) {
                characters.add(string.charAt(i));
            }
            else {
                if (characters.size() > max.size()) {
                    max.clear();
                    max.addAll(characters);
                    characters.clear();
                } else {
                    characters.clear();
                }
            }
            if(i==string.length()-1){
                if(characters.size()>max.size()){
                    max.clear();
                    max.addAll(characters);
                }
                characters.clear();
            }
        }

        for (Character a : max
        ) {
            System.out.print(a);
        }
    }
}
