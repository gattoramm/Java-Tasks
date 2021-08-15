package Generics.task1;

public class task1 {
    static class Gen<T> {
        // объявление объекта типа T
        T ob;

        // Передать конструктору ссылку на объект типа T
        Gen (T o) {
            ob = o;
        }

        // Вернуть ob
        T getOb() {
            return ob;
        }

        // Показать тип T
        void showType() {
            System.out.println("Тип Т: " + ob.getClass().getName());
        }
    }

    public static void main(String[] args) {
        // Создаём Gen-ссылку для Integer
        Gen<Integer> iOb;

        // Создаём объект Gen<Integer>
        iOb = new Gen<Integer>(77);

        // Показать тип данных, используемый iOb
        iOb.showType();

        // Получить значение iOb
        int value = iOb.getOb();
        System.out.println("Значение: " + value);

        // Создадим объект Gen для String
        Gen<String> strOb = new Gen<>("Текст");

        // Показать тип данных, используемый strOb
        strOb.showType();

        // Получить значение strOb
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
