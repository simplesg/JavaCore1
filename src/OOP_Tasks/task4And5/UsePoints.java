package OOP_Tasks.task4And5;

public class UsePoints extends Point {


    public UsePoints(){
        super(10,5,7);
        System.out.println("This is the constructor of UsePoints class");
    }

    public UsePoints(int x, int y){
        super(x , y);
    }

    public static void main(String[] args) {
        Point point = new Point();

        point.getX();    // we can get the values from private fields using public methods that are getters
        point.getY();
        point.getZ();

        point.setX(10); // we can set new values for fields that are private in class Point
        point.setY(5);
        point.setZ(8);
    }
}
