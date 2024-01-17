import java.util.ArrayList;
import java.util.List;

class Canvas implements Shape {
    private List<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        ///
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
