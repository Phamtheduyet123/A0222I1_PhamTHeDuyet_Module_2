package bai_tap.fan;


import thuc_hanh.lop_hinh_chu_nhat.Rectangle;

public class TwoFan {
    public static void main(String[] args) {
        Fan s1 = new Fan();
        s1.setSpeed(3);
        s1.setRadius(10);
        s1.setColor("yellow");
        s1.setOn(true);
        System.out.println(s1.toString1());
        Fan s2 = new Fan();
        s2.setSpeed(2);
        s2.setRadius(5);
        s2.setColor("blue");
        s2.setOn(false);
        System.out.println(s2.toString1());
    }
}
