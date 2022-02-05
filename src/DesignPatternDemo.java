import DesignPattern.AbstractFactory.AbstractFactory;
import DesignPattern.AbstractFactory.Color;
import DesignPattern.AbstractFactory.FactoryProducer;
import DesignPattern.Decorator.Circle;
import DesignPattern.Decorator.Rectangle;
import DesignPattern.Decorator.RedShapeDecorator;
import DesignPattern.Decorator.ShapeDecorator;
import DesignPattern.Observer.CurrentConditionDisplay;
import DesignPattern.Observer.Observer;
import DesignPattern.Observer.WeatherData;
import DesignPattern.Prototype.ShapeCache;
import DesignPattern.Singleton.Singleton;
import DesignPattern.Factory.Shape;
import DesignPattern.Factory.ShapeFactory;
import DesignPattern.Strategy.Duck.*;
import DesignPattern.Strategy.Fly.*;
import DesignPattern.Strategy.Quack.*;

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

        /*Decorator Pattern*/
        DesignPattern.Decorator.Shape dc_circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        dc_circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        /*Strategy Pattern*/
        Duck md = new MallardDuck(new FlyWithWings(), new Squeak());
        md.display();
        md.performFly();
        md.setFlyBehavior(new FlyNoWay());
        md.performFly();
        md.performQuack();

        /*Observer Pattern*/
        WeatherData w = new WeatherData();
        CurrentConditionDisplay c = new CurrentConditionDisplay(w);
        w.setMeasurements(10, 11, 12);
        w.setMeasurements(50, 75, 34);
    }
}