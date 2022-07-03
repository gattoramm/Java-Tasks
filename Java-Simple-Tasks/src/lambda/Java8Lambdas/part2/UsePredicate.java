package lambda.Java8Lambdas.part2;

import java.util.function.Predicate;

public class UsePredicate {
    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
        //System.out.println(atLeast5);
    }
}
