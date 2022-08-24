package Patterns.Strategy.part3;

public class Airplane extends Machine implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane is FLY");
    }

    @Override
    void display() {
        System.out.println("I can see Airplane");
    }
}
