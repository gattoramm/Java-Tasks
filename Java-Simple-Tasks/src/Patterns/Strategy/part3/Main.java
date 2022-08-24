package Patterns.Strategy.part3;

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus();
        System.out.println("Autobus:");
        autobus.display();
        autobus.run();
        autobus.beep();

        System.out.println();

        System.out.println("Automobile:");
        Automobile automobile = new Automobile();
        automobile.display();
        automobile.run();
        automobile.beep();

        System.out.println();

        System.out.println("Bicycle:");
        Bicycle bicycle = new Bicycle();
        bicycle.display();

        System.out.println();

        System.out.println("Scooter:");
        Scooter scooter = new Scooter();
        scooter.display();

        System.out.println();

        System.out.println("Airplane:");
        Airplane airplane = new Airplane();
        airplane.display();
        airplane.fly();
    }
}
