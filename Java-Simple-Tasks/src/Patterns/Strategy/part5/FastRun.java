package Patterns.Strategy.part5;

public class FastRun implements RunBehavior{
    @Override
    public void run() {
        System.out.println("FAST RUN!");
    }
}
