package Patterns.Strategy.part2;

public abstract class Machine {
    void run() {
        System.out.println("RUN!");
    }

    void beep() {
        System.out.println("BEEP!");
    }

    void fly() {
        System.out.println("FLY!");
    }

    abstract void display();
}
