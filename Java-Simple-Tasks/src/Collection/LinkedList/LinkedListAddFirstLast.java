package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListAddFirstLast {

    String model;

    public LinkedListAddFirstLast(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        LinkedList<LinkedListAddFirstLast> cars = new LinkedList<>();
        LinkedListAddFirstLast ferrari = new LinkedListAddFirstLast("Ferrari 360 Spider");
        LinkedListAddFirstLast bugatti = new LinkedListAddFirstLast("Bugatti Veyron");
        LinkedListAddFirstLast lambo = new LinkedListAddFirstLast("Lamborghini Diablo");
        LinkedListAddFirstLast ford = new LinkedListAddFirstLast("Ford Mondeo");
        LinkedListAddFirstLast fiat = new LinkedListAddFirstLast("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);

    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + '}';
    }

}
