package part8_Polymorphism.Exercises.Ex1;

public class Wheel {
    public enum Transport {
        ONE_WHEEL, TWO_WHEEL, THREE_WHEEL;
    }

    public static void ride(Cycle t) {
        t.ride(Transport.TWO_WHEEL);
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}
