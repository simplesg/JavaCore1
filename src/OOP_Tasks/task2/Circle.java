package OOP_Tasks.task2;

import OOP_Tasks.task8.GraphicObject;

public class Circle extends GraphicObject {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method that returns the value of area of the circle using formula pi*r^2
    public double circleArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    //method that returns the value of perimeter of the circle using formula pi*2*r
    public double circlePerimeter(){
        return Math.PI * 2 * this.radius;
    }

    //method implemented from abstract class
    @Override
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }


}
