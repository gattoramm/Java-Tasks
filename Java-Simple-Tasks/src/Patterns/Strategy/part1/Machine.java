package Patterns.Strategy.part1;

public abstract class Machine {
    void run() {
        System.out.println("RUN!");
    }

    void beep() {
        System.out.println("BEEP!");
    }

    abstract void display();
}
