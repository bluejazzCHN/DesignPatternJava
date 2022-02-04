package DesignPattern.Strategy.Duck;

import DesignPattern.Strategy.Fly.*;
import DesignPattern.Strategy.Quack.*;

public class MallardDuck extends Duck {
    public MallardDuck(FlyWithWings fb, Squeak qb) {
        this.flyBehavior = fb;
        this.quackBehaviour = qb;
    }

    @Override
    public void display() {
        System.out.println("I'm a real marllard duck.");
    }

}
