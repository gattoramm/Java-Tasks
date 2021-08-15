package Interfaces.task1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");

        outputInfo(animal);
        outputInfo(person);

        person.sayHello();
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
