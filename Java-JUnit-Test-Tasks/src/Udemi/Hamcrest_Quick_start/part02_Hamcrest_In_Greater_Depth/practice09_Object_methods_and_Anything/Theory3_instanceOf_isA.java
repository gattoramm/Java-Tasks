package Udemi.Hamcrest_Quick_start.part02_Hamcrest_In_Greater_Depth.practice09_Object_methods_and_Anything;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

public class Theory3_instanceOf_isA {
    @Test
    public void test1() {
        Car car = new Car();
        Convertible convertible = new Convertible();

        assertThat(car, instanceOf(Vehicle.class));
        assertThat(car, isA(Car.class));
        assertThat(convertible, isA(Vehicle.class));
        assertThat(convertible, isA(Car.class));
        assertThat(convertible, isA(Convertible.class));
    }
}

interface Vehicle {
    public void move();
}

class Car implements Vehicle {
    public void move() {
    }
}

class Convertible extends Car {
    boolean isTopDown;

    public boolean isTopDown() {
        return isTopDown;
    }
}
