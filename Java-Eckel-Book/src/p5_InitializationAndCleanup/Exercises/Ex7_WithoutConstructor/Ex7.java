package p5_InitializationAndCleanup.Exercises.Ex7_WithoutConstructor;

// Создайте классбез конструктора. Создайте объект этого класса
// в методе main(), чтобы удостовериться, что конструктор по
// умолчанию синтезируется автоматически.

public class Ex7 {
    static class NoConstructor {}

    public static void main(String[] args) {
        new NoConstructor();
    }
}
