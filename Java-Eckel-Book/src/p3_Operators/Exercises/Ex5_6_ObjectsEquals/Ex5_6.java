package p3_Operators.Exercises.Ex5_6_ObjectsEquals;

class Dog {
    String name, says;
}

public class Ex5_6 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        System.out.println("Name spot: " + spot.name);
        System.out.println("Name says: " + spot.says);
        System.out.println();

        System.out.println("Name scruffy: " + scruffy.name);
        System.out.println("Name scruffy: " + scruffy.says);
        System.out.println();

        Dog dog = spot;

        System.out.println(dog.equals(spot));
    }
}
