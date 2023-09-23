package dp.factory;

public class NoShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape not supported");
    }
}
