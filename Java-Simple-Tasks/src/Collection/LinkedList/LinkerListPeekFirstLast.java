package Collection.LinkedList;

import java.util.LinkedList;

public class LinkerListPeekFirstLast {

    String model;

    public LinkerListPeekFirstLast(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        LinkedList<LinkerListPeekFirstLast> cars = new LinkedList<>();
        LinkerListPeekFirstLast ferrari = new LinkerListPeekFirstLast("Ferrari 360 Spider");
        LinkerListPeekFirstLast bugatti = new LinkerListPeekFirstLast("Bugatti Veyron");
        LinkerListPeekFirstLast lambo = new LinkerListPeekFirstLast("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());

    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + '}';
    }

}
