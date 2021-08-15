package Generics.task2;

public class task2 {

    static class TwoGen<T, V> {
        T ob1;
        V ob2;

        // Передать конструктору ссылки на объекты двух типов
        TwoGen(T o1, V o2) {
            ob1 = o1;
            ob2 = o2;
        }

        // Показать тип T, V
        void showTypes() {
            System.out.println("Тип T: " + ob1.getClass().getName());
            System.out.println("Тип V: " + ob2.getClass().getName());
        }

        // Вернуть ob1
        T getOb1() {
            return ob1;
        }

        // Вернуть ob1
        V getOb2() {
            return ob2;
        }
    }

    public static void main(String[] args) {
        // Используем созданный класс
        TwoGen<Integer, String> twoGenObj = new TwoGen<Integer, String>(88, "Текст");

        // Узнаем типы
        twoGenObj.showTypes();

        // Узнаем значения
        int value = twoGenObj.getOb1();
        String str = twoGenObj.getOb2();
        System.out.println("Значение T: " + value);
        System.out.println("Значение V: " + str);
    }
}
