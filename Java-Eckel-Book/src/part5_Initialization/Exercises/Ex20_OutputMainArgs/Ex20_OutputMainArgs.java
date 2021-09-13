package part5_Initialization.Exercises.Ex20_OutputMainArgs;

public class Ex20_OutputMainArgs {
    public static void main(String[] args) {
        MainArgs.main("one", "two", "four");
        System.out.println();
        MainArgs.main("1", "2", "3", "4");
        System.out.println();
        MainArgs.main(new String("ff"), "dd");
    }
}

class MainArgs {
    public static void main(String... args) {
        for(String s: args) {
            System.out.print(s + " ");
        }
    }
}
