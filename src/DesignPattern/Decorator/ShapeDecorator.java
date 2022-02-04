package DesignPattern.Decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape toDecoratedShape) {
        this.decoratedShape = toDecoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
