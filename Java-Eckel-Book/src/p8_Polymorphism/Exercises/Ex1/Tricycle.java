package p8_Polymorphism.Exercises.Ex1;

public class Tricycle extends Cycle{
    public void ride(Transport t) {
        System.out.println("Tricycle.ride() " + Transport.THREE_WHEEL);
    }
}
