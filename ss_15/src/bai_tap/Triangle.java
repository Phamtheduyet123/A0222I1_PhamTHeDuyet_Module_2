package bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Triangle {
    int a,b,c;
    public Triangle(int a, int  b, int c)throws IllegalTriangleException{
        this.a = a;
        this.b = b;
        this.c = c;
        if(this.a<0 || this.b<0 || this.c<0){
            throw new IllegalTriangleException("Canh cua tam giac khong the nho hon 0");
        }
        if(this.a+this.b<=this.c || this.a+this.c<=this.b || this.b+this.c<=this.a){
            throw  new IllegalTriangleException("Loi.Tam giac khong hop le");
        }else {
            System.out.println("Tam giac hop le!");
        }
    }

}
