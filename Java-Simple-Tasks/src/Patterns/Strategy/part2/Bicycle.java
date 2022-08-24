package Patterns.Strategy.part2;

public class Bicycle extends Machine {
    @Override
    void display() {
        System.out.println("I can see Bicycle");
    }

    @Override
    void run() {}

    @Override
    void beep() {}
}
