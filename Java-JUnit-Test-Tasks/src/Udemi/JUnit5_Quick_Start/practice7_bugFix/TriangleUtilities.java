package Udemi.JUnit5_Quick_Start.practice7_bugFix;

public class TriangleUtilities {
    static public int getPerimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    static boolean isIsosceless(int sideA, int sideB, int sideC) {
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }
}
