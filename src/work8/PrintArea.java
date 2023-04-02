package work8;

public class PrintArea {

    public static void printer(Shape s) {

        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 2);

        System.out.println("area is " + s.getArea(point1, point2));

    }
}
