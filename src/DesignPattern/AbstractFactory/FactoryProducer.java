package DesignPattern.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        }
        if (factory.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        if (factory.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
