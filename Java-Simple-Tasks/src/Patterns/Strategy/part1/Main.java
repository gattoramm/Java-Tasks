package Patterns.Strategy.part1;

public class Main {
    static void seeMachineObject(Machine m) {
        m.display();
        m.run();
        m.beep();
    }

    public static void main(String[] args) {
        Autobus autobus = new Autobus();
        System.out.println("Autobus:");
        seeMachineObject(autobus);

        System.out.println();

        System.out.println("Automobile:");
        Automobile automobile = new Automobile();
        seeMachineObject(automobile);
    }
}
