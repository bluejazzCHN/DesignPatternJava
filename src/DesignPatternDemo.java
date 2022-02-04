import DesignPattern.AbstractFactory.AbstractFactory;
import DesignPattern.AbstractFactory.Color;
import DesignPattern.AbstractFactory.FactoryProducer;
import DesignPattern.Prototype.ShapeCache;
import DesignPattern.Singleton.Singleton;
import DesignPattern.Factory.Shape;
import DesignPattern.Factory.ShapeFactory;

public class DesignPatternDemo {
    public static void main(String[] args) {

        System.out.println("Design Pattern Demo.");

        /*Singleton demo*/
        Singleton obj = Singleton.getInstance();
        obj.showMessage();

        /*Factory demo*/
        Shape circle = ShapeFactory.getShape(ShapeFactory.circle);
        circle.draw();
        Shape rectangle = ShapeFactory.getShape(ShapeFactory.rectangle);
        rectangle.draw();
        Shape square = ShapeFactory.getShape(ShapeFactory.square);
        square.draw();

        /*AbstractFactory demo*/
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        DesignPattern.AbstractFactory.Shape af_circle =
                shapeFactory.getShape(DesignPattern.AbstractFactory.ShapeFactory.circle);
        af_circle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fill();
        Color blue = colorFactory.getColor("blue");
        blue.fill();

        /*prototype pattern*/
        ShapeCache.loadCache();

        DesignPattern.Prototype.Shape clonedShape = (DesignPattern.Prototype.Shape) ShapeCache.getShape("1");
        System.out.println("Cloned Shape : " + clonedShape.getType());
        clonedShape.draw();

        DesignPattern.Prototype.Shape clonedShape2 = (DesignPattern.Prototype.Shape) ShapeCache.getShape("2");
        System.out.println("Cloned Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        DesignPattern.Prototype.Shape clonedShape3 = (DesignPattern.Prototype.Shape) ShapeCache.getShape("3");
        System.out.println("Cloned Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}