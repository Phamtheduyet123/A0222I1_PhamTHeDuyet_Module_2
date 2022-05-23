import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("input");
            char c = sc.nextLine().charAt(0);
            System.out.println("output"+c);
        }
    }
}
