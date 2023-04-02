package work8.shapes;

import work8.Point;
import work8.Shape;

public class RightIsoscelesTriangle implements Shape{
    private Point point1;
    private Point point2;

    public RightIsoscelesTriangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public RightIsoscelesTriangle() {

    }

    @Override
    public String getName() {
        return "right isosceles triangle";
    }

    @Override
    public Shape creatShape() {
        return new RightIsoscelesTriangle(point1, point2);
    }

    @Override
    public double getArea(Point point1, Point point2) {
        return 0.25 * (Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}
