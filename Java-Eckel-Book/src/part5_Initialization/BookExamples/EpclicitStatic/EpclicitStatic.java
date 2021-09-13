package part5_Initialization.BookExamples.EpclicitStatic;


class Cup {
    Cup(int maker) {
        System.out.println("Cup(" + maker + ")");
    }
    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }
}

class Cups {
    static Cup cup1, cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups");
    }
}

public class EpclicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}
