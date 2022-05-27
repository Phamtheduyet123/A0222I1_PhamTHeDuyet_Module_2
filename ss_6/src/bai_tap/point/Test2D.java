package bai_tap.point;

public class Test2D {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setXY(1.3f,5.4f);
        float[] b = a.getXY();
        for (int i = 0; i <b.length ; i++) {
            if(i==0){
                System.out.println("x ="+b[i]);
            }
            else {
                System.out.println("y = "+b[i]);
            }
        }
        System.out.println("------\n"+a.toString());
    }
}
