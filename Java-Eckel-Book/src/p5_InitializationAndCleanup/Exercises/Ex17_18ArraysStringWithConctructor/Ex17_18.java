package p5_InitializationAndCleanup.Exercises.Ex17_18ArraysStringWithConctructor;

public class Ex17_18 {

    public Ex17_18(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] s1 = new String[] {};
        System.out.println("---------------------------");
        Object[] s2 = new Object[] { new Ex17_18("s1"), new Ex17_18("s2"), };
    }
}
