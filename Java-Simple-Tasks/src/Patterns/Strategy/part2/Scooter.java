package Patterns.Strategy.part2;

public class Scooter extends Machine{
    @Override
    void display() {
        System.out.println("I can see Scooter");
    }

    @Override
    void run() {}

    @Override
    void beep() {}
}
