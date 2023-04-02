package work8.shapes;

import work8.Point;
import work8.Shape;

public class Quad implements Shape {
    private Point point1;
    private Point point2;

    public Quad(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Quad() {}

    @Override
    public String getName() {
        return "quad";
    }

    @Override
    public Shape creatShape() {
        return new Quad(point1, point2);
    }

    @Override
    public double getArea(Point point1, Point point2) {
        return  Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2);
    }
}
