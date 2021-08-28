package part5.Initialization.Exercises.Ex8_This;

// Создайте классс двумя методами. В первом методе дважды вызовите второй
// метод: один раз без ключевого слова this, а во второй с this - просто
// для того, чтобы убедиться в работоспособности этого синтаксиса; не
// используйте этот способ вызова на практике.

public class Ex8 {
    static class ToThisOrNotToThis {
        public void MethodOne() {
            MethodTwo();
            this.MethodTwo();
            System.out.println("MethodOne()");
        }

        public void MethodTwo() {
            System.out.println("MethodTwo()");
        }
    }

    public static void main(String[] args) {
        new ToThisOrNotToThis().MethodOne();
    }
}
