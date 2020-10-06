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

    public double circleArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double circlePerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }


}
