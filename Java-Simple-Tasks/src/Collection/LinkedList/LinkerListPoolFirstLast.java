package Collection.LinkedList;

import java.util.LinkedList;

public class LinkerListPoolFirstLast {

    String model;

    public LinkerListPoolFirstLast(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        LinkedList<LinkerListPoolFirstLast> cars = new LinkedList<>();
        LinkerListPoolFirstLast ferrari = new LinkerListPoolFirstLast("Ferrari 360 Spider");
        LinkerListPoolFirstLast bugatti = new LinkerListPoolFirstLast("Bugatti Veyron");
        LinkerListPoolFirstLast lambo = new LinkerListPoolFirstLast("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        System.out.println(cars);

    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + '}';
    }

}
