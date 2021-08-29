package ITVDN.Part3_Liskov_Substitution_Principle.part34_homework.source;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        Rectangle square = new Square(10);

        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("Perimeter = " + square.perimeter());
    }
}
