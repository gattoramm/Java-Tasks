package part8_Polymorphism.Exercises.Ex1;

public class Unicycle extends Cycle{
    @Override
    public void ride(Wheel.Transport t) {
        System.out.println("Unicycle.ride() " + Wheel.Transport.ONE_WHEEL);
    }
}
