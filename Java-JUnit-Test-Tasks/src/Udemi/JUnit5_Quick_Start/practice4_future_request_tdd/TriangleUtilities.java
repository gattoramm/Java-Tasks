package Udemi.JUnit5_Quick_Start.practice4_future_request_tdd;

public class TriangleUtilities {
    static public double getArea(int base, int height) {
        return 0.5 * base * height;
    }

    static public int getPerimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    public static boolean isEquilateral(int sideA, int sideB, int sideC) {
        //throw new java.lang.UnsupportedOperationException("Not yet implemented");
        return (sideA == sideB && sideB == sideC && sideA == sideC);
    }
}
