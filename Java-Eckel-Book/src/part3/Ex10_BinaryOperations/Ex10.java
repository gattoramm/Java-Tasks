package part3.Ex10_BinaryOperations;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 0b101010;
        int num2 = 0b010101;

        System.out.println("Num1 in binary = " + Integer.toBinaryString(num1));
        System.out.println("Num2 in binary = " + Integer.toBinaryString(num2));
        System.out.println("Num1 in decimal = " + num1);
        System.out.println("Num2 in decimal = " + num2);

        int numAnd = num1&num2;
        int numOr = num1|num2;
        int numXor = num1^num2;

        int notNum1 = ~num1;
        int notNum2 = ~num2;

        System.out.println("NOT");
        System.out.println("NOT Num1 in Binary = " + Integer.toBinaryString(notNum1));
        System.out.println("NOT Num1 in Decimal = " + notNum1);
        System.out.println("NOT Num2 in Binary = " + Integer.toBinaryString(notNum2));
        System.out.println("NOT Num2 in Decimal = " + notNum2);

        System.out.println("AND");
        System.out.println("Num2 AND Num2 in Binary = " + Integer.toBinaryString(numAnd));
        System.out.println("Num2 AND Num2 in Decimal = " + numAnd);

        System.out.println("OR");
        System.out.println("Num2 OR Num2 in Binary = " + Integer.toBinaryString(numOr));
        System.out.println("Num2 OR Num2 in Decimal = " + numOr);

        System.out.println("XOR");
        System.out.println("Num2 XOR Num2 in Binary = " + Integer.toBinaryString(numXor));
        System.out.println("Num2 XOR Num2 in Decimal = " + numXor);
    }
}
