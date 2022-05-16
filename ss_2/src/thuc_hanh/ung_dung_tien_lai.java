package thuc_hanh;

import java.util.Scanner;

public class ung_dung_tien_lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng tiền cho vay");
        String  moneys = sc.nextLine();
        float money = Float.parseFloat(moneys);
        System.out.println("Nhập tỷ lệ lãi suất theo tháng");
        String  interestRates = sc.nextLine();
        float interestRate = Float.parseFloat(interestRates);
        System.out.println("Nhập số tháng vay");
        String  months = sc.nextLine();
        int month = Integer.parseInt(months);
        double totalInterest = 0.0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }

}
