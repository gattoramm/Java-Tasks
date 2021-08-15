package Collection.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

    String model;

    public LinkedListToArray(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        LinkedList<LinkedListToArray> cars = new LinkedList<>();
        LinkedListToArray ferrari = new LinkedListToArray("Ferrari 360 Spider");
        LinkedListToArray bugatti = new LinkedListToArray("Bugatti Veyron");
        LinkedListToArray lambo = new LinkedListToArray("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        LinkedListToArray[] carsArray = cars.toArray(new LinkedListToArray[3]);
        System.out.println(Arrays.toString(carsArray));

    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + '}';
    }

}
