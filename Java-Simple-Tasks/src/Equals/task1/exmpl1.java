package Equals.task1;

public class exmpl1 {
    int dnaCode;

    public boolean equals(exmpl1 ex1) {
        return this.dnaCode == ex1.dnaCode;
    }

    public static void main(String[] args) {
        exmpl1 ex1 = new exmpl1();
        ex1.dnaCode = 11122333;

        exmpl1 ex2 = new exmpl1();
        ex2.dnaCode = 11122333;

        System.out.println(ex1.equals(ex2));
    }
}
