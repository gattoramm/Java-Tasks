package Patterns.Strategy.part3;

public class Autobus extends Machine implements Runnable, Beepable{
    @Override
    public void beep() {
        System.out.println("Autobus is RUN");
    }

    @Override
    void display() {
        System.out.println("I can see Autobus");
    }

    @Override
    public void run() {
        System.out.println("Autobus can BEEP");
    }
}
