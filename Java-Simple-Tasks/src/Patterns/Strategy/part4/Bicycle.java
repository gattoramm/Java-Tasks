package Patterns.Strategy.part4;

public class Bicycle extends Machine{
    public Bicycle() {
        ringBehavior = new Ring();
    }

    @Override
    void display() {
        System.out.println("I can see Bicycle");
    }
}
