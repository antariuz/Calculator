package functionalInterface;

import java.util.function.DoubleBinaryOperator;

public class Main {

    public static void main(String[] args) {

        double x = 4.0d;
        double y = 3.0d;

        DoubleBinaryOperator addition = (a, b) -> x + y;

        DoubleBinaryOperator subtraction = (a, b) -> x - y;

        DoubleBinaryOperator multiplication = (a, b) -> x * y;

        DoubleBinaryOperator division = (a, b) -> x / y;

        DoubleBinaryOperator exponentiation = Math::pow;

        DoubleBinaryOperator squareRoot = (a, b) -> Math.sqrt(x);

        SquareRoot mySqrt = a -> Math.sqrt(x); //or SquareRoot mySqrt = Math::sqrt;

        System.out.println("x + y = " + addition.applyAsDouble(x, y));
        System.out.println("x - y = " + subtraction.applyAsDouble(x, y));
        System.out.println("x * y = " + multiplication.applyAsDouble(x, y));
        System.out.println("x / y = " + division.applyAsDouble(x, y));
        System.out.println("x ^ y = " + exponentiation.applyAsDouble(x, y));
        System.out.println("√x = " + squareRoot.applyAsDouble(x, y));
        System.out.println("my sqrt: √x = " + mySqrt.calc(x));

    }
}
