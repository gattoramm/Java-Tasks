package p8_Polymorphism.Exercises.Ex4;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        // заполняем массив фигурами
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        // полиморфные вызовы методов
        for(Shape shp : s) {
            shp.draw();
        }

        // полиморфизм для Rectangle
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
