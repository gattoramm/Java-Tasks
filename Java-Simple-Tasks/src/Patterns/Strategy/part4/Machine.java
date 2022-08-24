package Patterns.Strategy.part4;

public abstract class Machine {
    FlyBehavior flyBehavior;
    RunBehavior runBehavior;
    BeepBehavior beepBehavior;
    RingBehavior ringBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    void performRun() {
        runBehavior.run();
    }

    void performBeep() {
        beepBehavior.beep();
    }

    void performRing() {
        ringBehavior.ring();
    }

    abstract void display();
}
