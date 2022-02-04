package Duck;

import Fly.FlyWithWings;
import Quack.Squeak;

public class MarllardDuck extends Duck {
    public MarllardDuck(FlyWithWings fb, Squeak qb) {
        this.flyBehavior = fb;
        this.quackBehaviour = qb;
    }

    public void display() {
        System.out.println("I'm a real marllard duck.");
    }

}
