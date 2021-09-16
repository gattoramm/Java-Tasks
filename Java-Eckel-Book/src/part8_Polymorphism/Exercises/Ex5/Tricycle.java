package part8_Polymorphism.Exercises.Ex5;

public class Tricycle extends Cycle {
    public void ride(Wheel.Transport t) {
        System.out.println("Tricycle.ride() " + Wheel.Transport.THREE_WHEEL);
    }
}
