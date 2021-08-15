package Udemi.JUnit5_Quick_Start.practice3_bugFix_practice;

public class RectangleUtilities {
    static public int getArea(int height, int width) {
        return height * width;
    }

    static public int getPerimeter(int height, int width) {
        return 2 * (height + width);
    }
}
