package Patterns.Strategy.part2;

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

        System.out.println();

        System.out.println("Bicycle:");
        Bicycle bicycle = new Bicycle();
        seeMachineObject(bicycle);

        System.out.println();

        System.out.println("Scooter:");
        Scooter scooter = new Scooter();
        seeMachineObject(scooter);
    }
}
