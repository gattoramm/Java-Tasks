package lambda.Schildt.MethodOfInstance;

public class MyIntNum {
    private int v;

    MyIntNum(int x) {v = x;}
    int getNum() {return v;}

    boolean isFactor(int n) {
        return v%n == 0;
    }
}

class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Создать ссылку для вызова метода isFactor() объекта myNum
        IntPredicate ip = myNum::isFactor;

        // Использовать ссылку для вызова метода isFactor() через метод test()
        result = ip.test(3);
        if (result) System.out.println("3 является делителем " + myNum.getNum());

        // Создать ссылку для вызова метода isFactor() объекта myNum2 и
        // использовать ссылку для вызова метода isFactor() через метод test()
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 не является делителем " + myNum2.getNum());
    }
}
