package part2.Ex1_DefaultInit;

public class Ex1 {

    public static class SomeIntChr {
        int someNum;
        char someChr;
    }

    public static void main(String[] args) {
        SomeIntChr num = new SomeIntChr();
        System.out.println("someNum = " + num.someNum);
        System.out.println("someChr = " + num.someChr);
    }
}
