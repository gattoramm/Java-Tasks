package part8_Polymorphism.Exercises.Ex4;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void info() {
        System.out.println("Output Square");
    }
}
