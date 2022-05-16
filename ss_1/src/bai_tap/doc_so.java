package bai_tap;

import java.util.Scanner;

public class doc_so {
    public static void main(String[] args) {
        System.out.println("Enter a number less than 4 digits");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result ="";
        if(number/100>0){
          int numbers = number/100;
            switch (numbers){
                case 9: result+="nine hundred ";break;
                case 8: result+="eight hundred ";break;
                case 7: result+="seven hundred ";break;
                case 6: result+="six hundred ";break;
                case 5: result+="five hundred ";break;
                case 4: result+="four hundred ";break;
                case 3: result+="three hundred ";break;
                case 2: result+="two hundred ";break;
                case 1: result+="one hundred ";break;

            }
        }
        if(number/10>0){
           int numbers = number/10;
           int num  = numbers%10;
            switch (num){
                case 9: result+="ninety ";break;
                case 8: result+="eighty ";break;
                case 7: result+="seventy ";break;
                case 6: result+="sixty ";break;
                case 5: result+="fifty ";break;
                case 4: result+="fourty ";break;
                case 3: result+="thirdty ";break;
                case 2: result+="twenty ";break;

            }
        }
        if(number/10>0){
            int numbers = number%100;
            switch (numbers){
                case 10: result+="ten ";break;
                case 11: result+="eleven ";break;
                case 12: result+="twelve ";break;
                case 13: result+="thirteen ";break;
                case 14: result+="fourteen ";break;
                case 15: result+="fifteen ";break;
                case 16: result+="sixteen ";break;
                case 17: result+="seventeen ";break;
                case 18: result+="eighteen ";break;
                case 19: result+="nineteen ";break;

            }
        }
        if(number%100>19){
           int numbers = number%10;
            switch (numbers){
                case 9: result+="nine";break;
                case 8: result+="eight";break;
                case 7: result+="seven";break;
                case 6: result+="six ";break;
                case 5: result+="five";break;
                case 4: result+="four ";break;
                case 3: result+="three";break;
                case 2: result+="two";break;
                case 1: result+="one";break;

            }
        }
        if(number<10){
            switch (number){
                case 9: result+="nine";break;
                case 8: result+="eight";break;
                case 7: result+="seven";break;
                case 6: result+="six ";break;
                case 5: result+="five";break;
                case 4: result+="four ";break;
                case 3: result+="three";break;
                case 2: result+="two";break;
                case 1: result+="one";break;

            }
        }
        System.out.println(result);
    }
}
