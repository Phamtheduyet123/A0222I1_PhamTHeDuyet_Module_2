package bai_tap.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(){

    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    QuadraticEquation(double a,double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    public double  getDiscriminant(){
        return b*b-(4*a*c);
    }
    public double getRoot1(){
        return (-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
    }

}
