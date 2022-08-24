package Patterns.Strategy.part4;

public class Scooter extends Machine{
    public Scooter() {
        ringBehavior = new Ring();
    }

    @Override
    void display() {
        System.out.println("I can see Bicycle");
    }
}
