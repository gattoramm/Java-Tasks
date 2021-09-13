package part5_Initialization.BookExamples.TerminaionCondition;

// Использование finalize() для выявления объекта,
// не осуществившего необходимой финализации.

class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    public void finalize() {
        if(checkedOut)
            System.out.println("Ошибка checkedOut");
        // Обычно это делается так:
        // super.finalize(); // Вызов версии базового класса
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Правильная очистка
        novel.checkIn();
        // Теряем ссылку
        new Book(true);
        // Принудительная уборка мусора и финализация
        System.gc();
    }
}
