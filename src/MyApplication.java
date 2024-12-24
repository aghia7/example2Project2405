import models.*;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 4, 5);
        Shape c = new Circle(5);
        Shape s = new Square(7);

        shapes.add(r);
        shapes.add(t);
        shapes.add(c);
        shapes.add(s);

        for (Shape shape : shapes) {
            System.out.println("_____________________________________");
            System.out.println("A shape of type: " + shape.getClass());
            System.out.println("perimeter: " + shape.perimeter());
            System.out.println("area: " + shape.area());
        }
    }
}
