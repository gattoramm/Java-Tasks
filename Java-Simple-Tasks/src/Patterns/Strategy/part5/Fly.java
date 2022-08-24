package Patterns.Strategy.part5;

public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FLY!");
    }
}
