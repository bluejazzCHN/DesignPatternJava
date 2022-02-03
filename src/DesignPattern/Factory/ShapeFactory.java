package DesignPattern.Factory;

public class ShapeFactory {
    public static String circle = "Circle";
    public static String square = "Square";
    public static String rectangle = "rectangle";

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(ShapeFactory.circle)) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(ShapeFactory.square)) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase(ShapeFactory.rectangle)) {
            return new Rectangle();
        }

        return null;
    }
}
