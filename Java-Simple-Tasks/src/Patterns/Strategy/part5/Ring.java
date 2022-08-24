package Patterns.Strategy.part5;

public class Ring implements RingBehavior {
    @Override
    public void ring() {
        System.out.println("RING!");
    }
}
