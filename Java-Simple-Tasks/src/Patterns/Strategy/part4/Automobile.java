package Patterns.Strategy.part4;

public class Automobile extends Machine{
    public Automobile() {
        runBehavior = new Run();
        beepBehavior = new Beep();
    }

    @Override
    void display() {
        System.out.println("I can see Autobus");
    }
}
