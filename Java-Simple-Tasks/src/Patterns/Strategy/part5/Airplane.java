package Patterns.Strategy.part5;

public class Airplane extends Machine {
    public Airplane() {
        flyBehavior = new Fly();
    }

    @Override
    void display() {
        System.out.println("I can see Airplane");
    }
}
