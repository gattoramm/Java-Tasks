package part5.Initialization.BookExamples.OrderOfInitialization;

// Демонстрирует порядок инициализации
// При вызове конструктора для создания объекта
// Windows выводится сообщение

class Windows {
    Windows(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Windows w1 = new Windows(1); // Перед конструктором
    House() {
        // Показывает, что выполняет конструктор
        System.out.println("House()");
        w3 = new Windows(33); // Повторная инициализация w3
    }
    Windows w2 = new Windows(3); // После конструктора
    void f2() {
        System.out.println("f()");
    }
    Windows w3 = new Windows(3); // В конце
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f2(); // Показывает, что объект сконструирован
    }
}
