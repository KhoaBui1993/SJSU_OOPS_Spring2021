/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
public class ShapeTest {
    public static void main(String[] arg) {
        //exercise 1
        Shapes shapesList = new Shapes();
        shapesList.add(new Rectangle(3, 2));
        shapesList.add(new Rectangle(12, 4.8));
        shapesList.add(new Triangle(4, 5));
        shapesList.add(new Triangle(5, 2));
        shapesList.add(new Hexagon(4));
        shapesList.add(new Hexagon(12));
        shapesList.add(new Circle(4));
        shapesList.add(new Circle(12));
        shapesList.compute();
        //exercise 2
        System.out.println("Max area:" + shapesList.max().toString());
        System.out.println("Min area:" + shapesList.min().toString());
    }
}
