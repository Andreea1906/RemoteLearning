import java.util.ArrayList;
import java.util.List;

class Rectangle implements Shape {
    private List<Line> lines;

    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        lines = new ArrayList<>();
        lines.add(new Line(topLeft, topRight));
        lines.add(new Line(topRight, bottomRight));
        lines.add(new Line(bottomRight, bottomLeft));
        lines.add(new Line(bottomLeft, topLeft));
    }

    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}