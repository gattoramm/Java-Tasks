package lambda.other.example1;

public class Main implements SomeInterface{
    public static void print2(Object object) {
        System.out.println("print2");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {

    }
}
