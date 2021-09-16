package part8_Polymorphism.Exercises.Ex1;

public class Bicycle extends Cycle {

    @Override
    public void ride(Transport t) {
        System.out.println("Bicycle.ride() " + Transport.TWO_WHEEL);
    }
}
