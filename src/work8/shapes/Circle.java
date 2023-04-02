package work8.shapes;

import work8.Shape;
import work8.Point;

public class Circle implements Shape {

    private Point point1;
    private Point point2;

    public Circle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Circle() {}

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public Shape creatShape() {
        return new Circle(point1, point2);
    }

    @Override
    public double getArea(Point point1, Point point2) {
        return Math.PI * (Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

}
