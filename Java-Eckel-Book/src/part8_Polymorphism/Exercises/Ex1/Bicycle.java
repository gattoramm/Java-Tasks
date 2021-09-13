package part8_Polymorphism.Exercises.Ex1;

public class Bicycle extends Cycle{
    @Override
    public void ride(Wheel.Transport t) {
        System.out.println("Bicycle.ride() " + Wheel.Transport.TWO_WHEEL);
    }
}
