package dp.factory;

public class FactoryMainDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();

        var square = factory.getShape("square");
        square.draw();
    }
}
