package DesignPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    public static String red = "Red";
    public static String blue = "Blue";
    public static String green = "Green";

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase(ColorFactory.blue)) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase(ColorFactory.red)) {
            return new Red();
        } else if (colorType.equalsIgnoreCase(ColorFactory.green)) {
            return new Green();
        }
        return null;
    }
}
