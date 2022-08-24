package Patterns.Strategy.part3;

public class Automobile extends Machine implements Runnable, Beepable{
    @Override
    void display() {
        System.out.println("I can see Autobus");
    }

    @Override
    public void beep() {
        System.out.println("Automobile can BEEP");
    }

    @Override
    public void run() {
        System.out.println("Automobile is RUN");
    }
}
