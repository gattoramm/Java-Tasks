package Baeldung.Hamcrest.practice03_BeanMatcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BeanMatcherTest {
    @Test
    public void givenBean_whenHasCorrectValue_thenCorrect() {
        Person person = new Person("Baeldung", "New York");
        assertThat(person, hasProperty("name", equalTo("Baeldung")));
    }

    @Test
    public void given2Beans_whenHavingSameValues_thenCorrect() {
        Person person1 = new Person("Baeldung", "New York");
        Person person2 = new Person("Baeldung", "New York");
        assertThat(person1, samePropertyValuesAs(person2));
    }
}

class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}