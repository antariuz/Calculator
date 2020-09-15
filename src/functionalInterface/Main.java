package functionalInterface;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        double x = 4.0d;
        double y = 3.0d;

        DoubleBinaryOperator addition = (a, b) -> x + y;

        DoubleBinaryOperator subtraction = (a, b) -> x - y;

        DoubleBinaryOperator multiplication = (a, b) -> x * y;

        DoubleBinaryOperator division = (a, b) -> x / y;

        DoubleBinaryOperator exponentiation = Math::pow;

        UnaryOperator<Double> squareRoot = a -> Math.sqrt(x);

        System.out.println("x + y = " + addition.applyAsDouble(x, y));
        System.out.println("x - y = " + subtraction.applyAsDouble(x, y));
        System.out.println("x * y = " + multiplication.applyAsDouble(x, y));
        System.out.println("x / y = " + division.applyAsDouble(x, y));
        System.out.println("x ^ y = " + exponentiation.applyAsDouble(x, y));
        System.out.println("√x = " + squareRoot.apply(x));

    }
    
}
