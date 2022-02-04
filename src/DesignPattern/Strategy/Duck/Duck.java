package DesignPattern.Strategy.Duck;

import DesignPattern.Strategy.Fly.*;
import DesignPattern.Strategy.Quack.*;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehaviour = qb;
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }
}