package dp.factory;

public class ShapeFactory {


    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            Shape c = new Circle();
            // injecter les dep
            // fetch info from REST API
            // Apply calc
            // agregation
            return c;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return new NoShape();
    }
}
