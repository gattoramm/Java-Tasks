package lambda.Schildt.Constructor;

public class MyClass {
    private String str;

    // Этот конструктор принимает аргумент
    MyClass(String s) {
        str = s;
    }

    // Это конструктор по умолчанию
    MyClass() {
        str = "";
    }

    String getStr() {return str;}
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass.
        // Поскольку метод func() интерфейса MyFunc принимает аргумент,
        // new ссылается на параметризованный конструктор MyClass,
        // а не на конструктор по умолчанию.
        MyFunc myClassCons = MyClass::new;
//        s -> new MyClass("");

        // Создать экземпляр MyClass посредством ссылки на конструктор
        MyClass mc = myClassCons.func("Тестирование");
        System.out.println("Строка str в mc: "+ mc.getStr());
    }
}
