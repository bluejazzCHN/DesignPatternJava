package DesignPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    public static String circle = "Circle";
    public static String rectangle = "Rectangle";
    public static String square = "Square";

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(ShapeFactory.circle)) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase(ShapeFactory.rectangle)) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase(ShapeFactory.square)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
