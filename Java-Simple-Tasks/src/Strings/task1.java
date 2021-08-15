package Strings;

public class task1 {
    public static void main(String[] args) {
        String f = "Lion.part1.end";
        String f2 = f.substring(0, f.indexOf('.'));
        String f3 = String.format("%-10s", f2);

        System.out.println(f2);

        System.out.println(f3 + "!");
        System.out.println(f3.length());
    }
}
