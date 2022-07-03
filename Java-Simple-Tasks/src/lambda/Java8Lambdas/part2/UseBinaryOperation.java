package lambda.Java8Lambdas.part2;

import java.util.function.BinaryOperator;

public class UseBinaryOperation {
    public static void main(String[] args) {
        BinaryOperator<Long> addLongs = (x, y) -> x + y;
    }
}
