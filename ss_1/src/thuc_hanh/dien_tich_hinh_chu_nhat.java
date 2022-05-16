package thuc_hanh;

import java.util.Scanner;

public class dien_tich_hinh_chu_nhat {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input width:");
        String widths = sc.nextLine();
        width = Float.parseFloat(widths);
        System.out.println("Input height:");
        String heights = sc.nextLine();
        height = Float.parseFloat(heights);
        float area = width*height;
        System.out.println("Area:"+area);
    }


}
