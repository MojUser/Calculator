package org.dominwos;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b ) {
        return a * b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {

        double result = 0.0;

        try {
            result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
            e.printStackTrace();
        }

        return result;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

}
