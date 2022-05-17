package part1.Strategy.Step1;

public abstract class Duck {
    void quack() {
        System.out.println("quack");
    }

    void swim() {
        System.out.println("swim");
    }

    abstract void display();
}
