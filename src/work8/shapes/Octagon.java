package work8.shapes;

import work8.Point;
import work8.Shape;

public class Octagon implements Shape {

    private Point point1;
    private Point point2;

    public Octagon(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Octagon() {

    }

    @Override
    public String getName() {
        return "octagon";
    }

    @Override
    public Shape creatShape() {
        return new Octagon(point1, point2);
    }
    @Override
    public double getArea(Point point1, Point point2) {
        return 2 * (1 + Math.sqrt(2)) * (Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}
