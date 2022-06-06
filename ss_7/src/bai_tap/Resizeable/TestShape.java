package bai_tap.Resizeable;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] =new Square(3);
        shapes[2] = new Rectangle(2,3);
        System.out.println("Pre-sorted:");
        Resizeable a = new Rectangle();

         //  ((Rectangle)a).getPerimeter();
        for (Shape shape: shapes) {
            System.out.println("\t "+shape);
        }

        System.out.println("After-sorted:");
        for (Shape shape:shapes) {
            //Không hiển thị hàm resize ở Square
            if (!(shape instanceof Square)) {
                ((Resizeable) shape).resize(Math.random() * 10);
            }
            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(Math.random() * 10);
            }
        }

    }
}
