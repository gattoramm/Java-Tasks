package Baeldung.Hamcrest.practice02_ObjectMatcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.typeCompatibleWith;

public class ObjectMatcherTest {
    //Проверим метод toString()
    @Test
    public void givenBean_whenToStringReturnsRequiredString_thenCorrect() {
        Person person = new Person("Barrack", "Washington");

        String str = person.toString();
        // Сопоставим произвольную строку
        assertThat(person, hasToString(str));
    }

    // Проверим, что класс является подклассом другого
    @Test
    public void given2Classes_whenOneInheritsFromOther_thenCorrect() {
        assertThat(Cat.class, typeCompatibleWith(Animal.class));
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

class Animal {

}

class Cat extends Animal{

}