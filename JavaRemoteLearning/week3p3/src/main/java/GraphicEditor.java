public class GraphicEditor {
    public static void main(String[] args) {

        Point point = new Point(10, 20);
        Point anotherPoint = new Point(30, 40);
        Line line = new Line(point, anotherPoint);
        Circle circle = new Circle(point, 15);
        Rectangle rectangle = new Rectangle(point, anotherPoint, new Point(30, 20), new Point(20, 40));

        Canvas canvas = new Canvas();
        canvas.addShape(point);
        canvas.addShape(line);
        canvas.addShape(circle);
        canvas.addShape(rectangle);


        Canvas anotherCanvas = new Canvas();
        anotherCanvas.addShape(point);
        anotherCanvas.addShape(canvas);


        canvas.draw();
        System.out.println("---------------------");
        anotherCanvas.draw();
    }
}
