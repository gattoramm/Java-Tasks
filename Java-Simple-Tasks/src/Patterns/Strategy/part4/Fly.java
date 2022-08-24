package Patterns.Strategy.part4;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FLY!");
    }
}
