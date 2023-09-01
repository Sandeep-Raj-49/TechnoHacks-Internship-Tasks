import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("Enter 'add' for addition");
            System.out.println("Enter 'subtract' for subtraction");
            System.out.println("Enter 'multiply' for multiplication");
            System.out.println("Enter 'divide' for division");
            System.out.println("Enter 'quit' to end the program");

            String userChoice = scanner.nextLine();

            if (userChoice.equals("quit")) {
                break;
            } else if (userChoice.equals("add")) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result = add(num1, num2);
                System.out.println("Result: " + result);
            } else if (userChoice.equals("subtract")) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result = subtract(num1, num2);
                System.out.println("Result: " + result);
            } else if (userChoice.equals("multiply")) {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result = multiply(num1, num2);
                System.out.println("Result: " + result);
            } else if (userChoice.equals("divide")) {
                System.out.print("Enter the dividend: ");
                double dividend = scanner.nextDouble();
                System.out.print("Enter the divisor: ");
                double divisor = scanner.nextDouble();
                double result = divide(dividend, divisor);
                if (Double.isInfinite(result) || Double.isNaN(result)) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + result);
                }
            } else {
                System.out.println("Invalid input");
            }

            // Consume the newline character left in the buffer
            scanner.nextLine();
        }

        scanner.close();
    }

    // Function to add two numbers
    public static double add(double x, double y) {
        return x + y;
    }

    // Function to subtract two numbers
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Function to multiply two numbers
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Function to divide two numbers
    public static double divide(double x, double y) {
        return x / y;
    }
}
