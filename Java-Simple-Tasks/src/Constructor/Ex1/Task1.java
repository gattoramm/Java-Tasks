package Constructor.Ex1;

public class Task1 {
    {
        System.out.println("block x");
    }

    static {
        System.out.println("block b");
    }

    public Task1() {
        System.out.println("in constructor");
    }

    {
        System.out.println("block d");
    }

    public static void main(String[] args) {
        Task1 t1;
    }
}
