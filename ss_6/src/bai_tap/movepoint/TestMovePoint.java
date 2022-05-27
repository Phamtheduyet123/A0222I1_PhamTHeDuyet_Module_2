package bai_tap.movepoint;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TestMovePoint {
    public static void main(String[] args) {
        MovePoint c = new MovePoint();
        Scanner sc = new Scanner(System.in);
        System.out.println("input xSpeed:");
        float xSpeed = sc.nextFloat();
        System.out.println("input ySpeed:");
        float ySpeed = sc.nextFloat();
        System.out.println("input x");
        float x= sc.nextFloat();
        System.out.println("input y");
        float y= sc.nextFloat();
        c.setXY(x,y);
        c.setSpeed(xSpeed,ySpeed);
        System.out.println("--------------"+c.toString()+"\n");
        System.out.println("++++++\n"+c.move());

    }
}
