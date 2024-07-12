package algebra_calculator;

import java.util.Date;
import java.util.Scanner;
public class algebra_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        System.out.println(date);
        System.out.println("Welcome to the Algebra Calculator!");
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Solve Equation");
            System.out.println("6. Simplify Expression");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    solveEquation(scanner);
                    break;
                case 6:
                    simplifyExpression(scanner);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void performAddition(Scanner scanner) {
        System.out.println("Enter two numbers to add:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scaalgebra_calculatornner) {
        System.out.println("Enter two numbers to subtract:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.println("Enter two numbers to multiply:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.println("Enter two numbers to divide:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    private static void solveEquation(Scanner scanner) {
        System.out.println("Enter a linear equation in the form ax + b = c");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Solution: x = " + x);
        } else {
            System.out.println("Invalid equation: 'a' cannot be zero.");
        }
    }
    

    private static void simplifyExpression(Scanner scanner) {
        // Placeholder for simplifying expressions (requires further implementation)
        System.out.println("Simplifying expressions is not yet implemented.");
        System.out.println("fffffffffffffffffffffff");
        System.out.println("Hello World");
    }
}
