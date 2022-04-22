package p8_Polymorphism.Exercises.Ex3;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void info() {
        System.out.println("Output Triangle");
    }
}
