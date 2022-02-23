package lambda.Schildt.MethodOfInstanceForJenerics;

public class MyClass {
    private int v;

    MyClass(int x) {v = x;}
    int getNum() {return v;}

    static <T> boolean isEqual(T x, T y) {
        return x == y;
    }
}

class MyClassDemo {
    public static void main(String[] args) {
        boolean result;

        MyClass myClass = new MyClass(12);
        MyClass myClass2 = new MyClass(16);

        // Создать ссылку mRef на экземплярный метод isEqual()
        SomeTest<Integer> mRef = MyClass::<Integer>isEqual;

        // Вызвать метод isEqual() для объекта myClass
        result = mRef.test(12,12);
        if (result) System.out.println("12 равно " + myClass.getNum());

        // Вызвать метод isEqual() для объекта myClass
        result = mRef.test(12,16);
        if (!result) System.out.println("12 не равно " + myClass2.getNum());
    }
}
