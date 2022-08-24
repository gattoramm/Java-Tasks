package Patterns.Strategy.part4;

public class Main {
    public static void main(String[] args) {
        Machine machine;
        machine = new Autobus();
        machine.display();
        machine.performRun();
        machine.performBeep();

        System.out.println();

        machine = new Automobile();
        machine.display();
        machine.performRun();
        machine.performBeep();

        System.out.println();

        machine = new Airplane();
        machine.display();
        machine.performFly();

        System.out.println();

        machine = new Bicycle();
        machine.display();
        machine.performRing();

        System.out.println();

        machine = new Scooter();
        machine.display();
        machine.performRing();
    }
}
