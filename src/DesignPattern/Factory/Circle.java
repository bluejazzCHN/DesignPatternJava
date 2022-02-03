package DesignPattern.Factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("in circle class draw method of factory pattern.");
    }
}
