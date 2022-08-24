package Patterns.Strategy.part5;

public abstract class Machine {
    FlyBehavior flyBehavior;
    RunBehavior runBehavior;
    BeepBehavior beepBehavior;
    RingBehavior ringBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public void setBeepBehavior(BeepBehavior beepBehavior) {
        this.beepBehavior = beepBehavior;
    }

    public void setRingBehavior(RingBehavior ringBehavior) {
        this.ringBehavior = ringBehavior;
    }

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
