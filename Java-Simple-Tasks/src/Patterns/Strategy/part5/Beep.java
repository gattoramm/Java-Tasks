package Patterns.Strategy.part5;

public class Beep implements BeepBehavior {
    @Override
    public void beep() {
        System.out.println("BEEP!");
    }
}
