package p8_Polymorphism.Exercises.Ex4;

public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }

    @Override
    public void info() {
        System.out.println("Output Rectangle");
    }
}
