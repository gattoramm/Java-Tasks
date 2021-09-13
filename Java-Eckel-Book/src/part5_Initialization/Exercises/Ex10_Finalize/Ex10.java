package part5_Initialization.Exercises.Ex10_Finalize;

class SomeClass {
    public void finalize() {
        System.out.println("Проверка finalize и условия готовности");
    }
}

public class Ex10 {
    public static void main(String[] args) {
        new SomeClass();
        System.gc();
    }
}
