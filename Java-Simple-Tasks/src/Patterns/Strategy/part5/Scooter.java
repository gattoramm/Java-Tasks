package Patterns.Strategy.part5;

public class Scooter extends Machine {
    public Scooter() {
        ringBehavior = new Ring();
    }

    @Override
    void display() {
        System.out.println("I can see Bicycle");
    }
}
