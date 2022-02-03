package DesignPattern.Factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("in rectangle class draw method of factory pattern.");
    }
}