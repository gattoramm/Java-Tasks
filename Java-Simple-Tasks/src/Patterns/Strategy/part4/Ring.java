package Patterns.Strategy.part4;

public class Ring implements RingBehavior{
    @Override
    public void ring() {
        System.out.println("RING!");
    }
}
