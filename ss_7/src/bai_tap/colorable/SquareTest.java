package bai_tap.colorable;

import bai_tap.Resizeable.Rectangle;
import bai_tap.Resizeable.Shape;


public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        for (Shape shape : shapes
        ) {
            System.out.println(shape);
            if (shape instanceof Colorable){
                ((Colorable)shape).howToColor();
            }

        }

    }
}
