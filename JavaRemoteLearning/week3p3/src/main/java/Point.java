public class Point implements Shape{

    private int X, Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public void draw() {
        System.out.println("Point at (" + X + ", " + Y + ")");
    }
}
