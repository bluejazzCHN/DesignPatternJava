package DesignPattern.Strategy.Quack;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak.");
    }
}
