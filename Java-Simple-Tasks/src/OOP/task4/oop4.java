package OOP.task4;

public class oop4 {
    public static void main(String[] args) {

        Animal animal = new Dog();
        Cat cat = (Cat) animal;
        cat.jump();

    }

    static class Animal {}
    static class Dog extends Animal {
        void bark() {}
    }

    static class Cat extends Animal {
        void jump() {}
    }
}
