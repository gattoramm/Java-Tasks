package Patterns.Strategy.part4;

public class Beep implements BeepBehavior {
    @Override
    public void beep() {
        System.out.println("BEEP!");
    }
}
