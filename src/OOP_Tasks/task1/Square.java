package OOP_Tasks.task1;

import OOP_Tasks.task8.GraphicObject;

public class Square extends GraphicObject {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    //method that returns the area of the square
    public int squareArea(){
        return this.sideLength * this.sideLength;
    }

    //method that returns the perimeter of the square
    public int squarePerimeter(){
        return 4 * this.sideLength;
    }

    //implemented method from abstract class
    @Override
    public double area(){
        return this.sideLength * this.sideLength;
    }
}
