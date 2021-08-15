package OOP.task3;

public class oop3 {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        System.out.println("Animal cat1 = new Cat(); cat1.run(); cat1.exist();");
        cat1.run();
        cat1.exist();
        System.out.println("**************************************************");

        Animal cat2 = new Animal();
        System.out.println("Animal cat2 = new Animal(); cat2.run(); cat2.exist();");
        cat2.run();
        cat2.exist();
        System.out.println("**************************************************");

        Cat cat3 = new Cat();
        System.out.println("Animal cat2 = new Animal(); cat3.run(); cat3.run();");
        cat3.jump();
        cat3.run();
        cat3.exist();
        System.out.println("**************************************************");

        Dog dog1 = new Dog();
        System.out.println("Dog dog1 = new Dog(); dog1.run(); dog1.bark(); dog1.exist();");
        dog1.run();
        dog1.bark();
        dog1.exist();
        System.out.println("**************************************************");

        Animal dog2 = new Dog();
        Cat cat4 = (Cat) dog2;

    }

    public static class Animal {
        public void run() {
            System.out.println("RUN, ANIMAL!!!!");
        }

        public void exist() {
            System.out.println("EXIST ANIMAL!!!!");
        }
    }

    public static class Cat extends Animal {
        public void jump() {
            System.out.println("JUMP, CAT!!!!");
        }
        @Override
        public void run() {
            System.out.println("RUN, CAT!!!!");
        }
    }

    public static class Dog extends Animal {
        public void bark() {
            System.out.println("Гав-гав");
        }
        @Override
        public void run() {
            System.out.println("RUN, DOG!!!!");
        }
    }
}


