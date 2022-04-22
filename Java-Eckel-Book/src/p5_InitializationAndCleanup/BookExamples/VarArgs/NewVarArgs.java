package p5_InitializationAndCleanup.BookExamples.VarArgs;

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(4, 3.14, 1.11 );

        printArray("one", "two", "three" );

        printArray( new A(), new A(), new A() );

        printArray( (Object[])new Integer[] { 1, 2, 3, 4, 5, } );

        printArray();
    }
}
