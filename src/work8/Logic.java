package work8;

import work8.shapes.*;

public class Logic {

    public static void doLogic(){

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle().creatShape();
        shapes[1] = new CorrectTriangle().creatShape();
        shapes[2] = new Octagon().creatShape();
        shapes[3] = new Quad().creatShape();
        shapes[4] = new RightIsoscelesTriangle().creatShape();

        for (Shape sh: shapes) {
            PrintName.printer(sh);
            PrintArea.printer(sh);
        }

    }
}
