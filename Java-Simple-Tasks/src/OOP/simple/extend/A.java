package OOP.simple.extend;

public class A {
    String s = "IM A!";

    public A() {
        System.out.println(getS());
        getTalk();
    }

    public void getTalk() {
        System.out.println("In A");
    }

    public String getS() {
        return s;
    }


    static class B extends A {
        String s = "IM B!";

        public B() {
            System.out.println(getS());
            getTalk();
        }

        @Override
        public String getS() {
            return s;
        }

        @Override
        public void getTalk() {
            System.out.println("In B");
        }
    }

    public static void main(String[] args) {
        new B();
    }
}
