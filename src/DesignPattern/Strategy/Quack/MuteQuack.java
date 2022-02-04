package DesignPattern.Strategy.Quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
