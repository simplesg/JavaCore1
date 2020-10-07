package OOP_Tasks.task4And5;

public class UsePoints extends Point {




    public UsePoints(int x, int y){
        super(x , y);                            //uses constructor with 2 parameters from Point class
    }

    public UsePoints(int x , int y, int z){
        super(x,y,z);                           //uses constructor with 3 parameters from Point class
        System.out.println("This is the constructor of UsePoints class");
    }

    public static void main(String[] args) {
        Point point = new Point();
//        Point point1 = new Point(10,20,30);
//        Point point2 = new Point(11,12);

        UsePoints usePoints = new UsePoints(5,10);
        UsePoints usePoints1 = new UsePoints(5,10,20);
        System.out.println(usePoints1.toString());

        point.getX();    // we can get the values from private fields using public methods that are getters
        point.getY();
        point.getZ();

        point.setX(10); // we can set new values for fields that are private in class Point
        point.setY(5);
        point.setZ(8);
    }


}
