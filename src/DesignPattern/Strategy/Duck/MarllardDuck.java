package DesignPattern.Strategy.Duck;

import Fly.FlyWithWings;
import Quack.Squeak;

public class MarllardDuck extends Duck.Duck {
    public MarllardDuck(FlyWithWings fb, Squeak qb) {
        this.flyBehavior = (Fly.FlyBehavior) fb;
        this.quackBehaviour = (Quack.QuackBehavior) qb;
    }

    @Override
    public void display() {
        System.out.println("I'm a real marllard duck.");
    }

}
