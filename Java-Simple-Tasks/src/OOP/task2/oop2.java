package OOP.task2;

public class oop2 {
    public static void main(String[] args) {
        B b = new B();
        b.prt();
    }
}

class A {
    private final String str = "PRIVATE";
    private void privprint() {
        System.out.println(str);
    }
    protected void prt() {privprint();}
}

class B extends A {}