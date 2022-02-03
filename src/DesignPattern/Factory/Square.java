package DesignPattern.Factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("in Square class draw method of factory pattern.");
    }
}
