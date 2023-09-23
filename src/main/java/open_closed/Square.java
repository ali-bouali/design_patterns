package open_closed;

public class Square implements Shape, ShapePerim {

    private double width;

    public Square(double width) {
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return width * width;
    }

    @Override
    public double calculatePerim() {
        return 0;
    }
}
