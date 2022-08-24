package Patterns.Strategy.part5;

public class Main {
    public static void main(String[] args) {
        Machine machine;
        machine = new Autobus();
        machine.display();
        machine.performRun();
        machine.setRunBehavior(new FastRun());
        machine.performRun();
    }
}
