package Udemi.Hamcrest_Quick_start.part01_Introduction.practice05_Matcher_practice1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class RideEligible {
    @Test
    public void test1() {
        Person joe = new Person("Joe", 15, 50);
        assertThat(joe.age, greaterThanOrEqualTo(10));
        assertThat(joe.height, greaterThanOrEqualTo(48));

        Person sally = new Person("Sally", 10, 40);
        assertThat(joe.age, greaterThanOrEqualTo(10));
        assertThat(joe.height, greaterThanOrEqualTo(48));
    }
}

class Person {
    String name;
    int age;
    int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}