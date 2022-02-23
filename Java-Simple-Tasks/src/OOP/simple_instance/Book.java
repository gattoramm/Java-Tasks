package OOP.simple_instance;

public class Book {
    String name;
    Book() {
        System.out.println("constructor1");
    }

    Book(String name) {
        this.name = name;
        System.out.println("constructor2");
    }

    void instance_method() {
        System.out.println("instance method");
    }

    public static void main(String[] args) {
        Book india1 = new Book();
        Book india2 = new Book("india");
        india1.instance_method();
    }
}
