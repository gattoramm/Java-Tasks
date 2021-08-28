package part5.Initialization.Exercises.Ex_19_String_Varargs;

public class Ex_19_String_Varargs {

    static void f(String... args) {
        for (String str: args) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        f("f", "ff");
        String[] ss = new String[]{"dd", "d"};
        f(ss);
    }
}
