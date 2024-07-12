package algebra_calculator;
import java.util.Scanner;
import java.util.Date;
class AlgebraCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date today=new Date();
        boolean exit = false;

        while (!exit) {
            System.out.println("Today's date is: "+ today);
            System.out.println("welcome to Algebra calculator v1.4");
            System.out.println("Select from the list: ");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.QUADRATIC EQUATION");
            System.out.println("0.EXIT");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> performAddition(input);

                case 2 -> performSubtraction(input);

                case 3 -> performMultiplication(input);

                case 4 -> performDivision(input);

                case 5 -> performQuadratic(input);

                case 0 -> exit = true;

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("GoodBye!!");
    }

    private static void performAddition(Scanner input) {
        System.out.println("Enter two numbers to add:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double result = num1 + num2;
        System.out.println("Result for Addition: " + result);

    }

    private static void performSubtraction(Scanner input) {
        System.out.println("Enter two numbers to subtract:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double result = num1 - num2;
        System.out.println("Result for sub: " + result);

    }

    private static void performMultiplication(Scanner input) {
        System.out.println("Enter two numbers to multiply:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double result = num1 * num2;
        System.out.println("Result for multiplication: " + result);
    }

    private static void performDivision(Scanner input) {
        System.out.println("Enter two numbers to divide:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result for division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

    }

    private static void performQuadratic(Scanner input){
        System.out.println("Enter a linear equation in the form ax + b = c");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Solution: x = " + x);
        } else {
            System.out.println("Invalid equation: 'a' cannot be zero.");
        }


    }
}
