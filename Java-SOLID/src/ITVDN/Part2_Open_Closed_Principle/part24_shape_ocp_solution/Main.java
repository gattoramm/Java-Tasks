package ITVDN.Part2_Open_Closed_Principle.part24_shape_ocp_solution;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(10,5);
        var rect2 = new Rectangle(20,37);

        var circ1 = new Circle(10);
        var circ2 = new Circle(5);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalc(rect1, rect2));
        System.out.println(ac.areaCalc(circ1, circ2));
    }
}
