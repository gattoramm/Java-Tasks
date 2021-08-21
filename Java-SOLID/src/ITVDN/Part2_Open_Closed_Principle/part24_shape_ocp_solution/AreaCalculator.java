package ITVDN.Part2_Open_Closed_Principle.part24_shape_ocp_solution;

public class AreaCalculator {
    public double areaCalc(Shape... shapes) {
        double totalArea = 0;
        for (var shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
