package Patterns.Strategy.part4;

public class Airplane extends Machine{
    public Airplane() {
        flyBehavior = new Fly();
    }

    @Override
    void display() {
        System.out.println("I can see Airplane");
    }
}
