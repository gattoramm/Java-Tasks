package p5_InitializationAndCleanup.BookExamples.VarArgs;

public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" длина " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" длина " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
