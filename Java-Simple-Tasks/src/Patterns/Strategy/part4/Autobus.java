package Patterns.Strategy.part4;

public class Autobus extends Machine{
    public Autobus() {
        runBehavior = new Run();
        beepBehavior = new Beep();
    }

    @Override
    void display() {
        System.out.println("I can see Autobus");
    }
}
