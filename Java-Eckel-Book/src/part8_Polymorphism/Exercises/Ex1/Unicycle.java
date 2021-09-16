package part8_Polymorphism.Exercises.Ex1;

public class Unicycle extends Cycle{
    @Override
    public void ride(Transport t) {
        System.out.println("Unicycle.ride() " + Transport.ONE_WHEEL);
    }
}
