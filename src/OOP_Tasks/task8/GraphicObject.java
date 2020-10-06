package OOP_Tasks.task8;

import OOP_Tasks.task1.Square;
import OOP_Tasks.task2.Circle;

public abstract class GraphicObject {

    public double area(){
        return 0;
    }

    public static void main(String[] args) {
        Circle circle  = new Circle(10);
        Square square = new Square(15);
        System.out.println("Circle area is: " + circle.area());
        System.out.println("Square area is: " + square.area());
    }
}
