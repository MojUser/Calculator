package org.dominwos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Square root");
            System.out.println("0 - Exit");

            Calculator calculator = new Calculator();

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            double result = 0.0;
            double a, b;

            switch (choice) {
                case 1:
                    System.out.println("Enter first value: ");
                    a = sc.nextDouble();
                    System.out.println("Enter second value: ");
                    b = sc.nextDouble();
                    result = calculator.add(a, b);
                    break;
                case 2:
                    System.out.println("Enter first value: ");
                    a = sc.nextDouble();
                    System.out.println("Enter second value: ");
                    b = sc.nextDouble();
                    result = calculator.subtract(a, b);
                    break;
                case 3:
                    System.out.println("Enter first value: ");
                    a = sc.nextDouble();
                    System.out.println("Enter second value: ");
                    b = sc.nextDouble();
                    result = calculator.multiply(a, b);
                    break;
                case 4:
                    System.out.println("Enter first value: ");
                    a = sc.nextDouble();
                    System.out.println("Enter second value: ");
                    b = sc.nextDouble();
                    result = calculator.divide(a, b);
                    break;
                case 5:
                    System.out.println("Enter the value: ");
                    a = sc.nextDouble();
                    result = calculator.squareRoot(a);
                    break;
            }

            if (choice >= 1 && choice <= 5) System.out.println("The result is: " + result);
            else System.out.println("Program exit");

        } while (choice != 0);
    }
}
