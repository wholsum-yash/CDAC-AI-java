import java.util.Scanner;

public class SimpleCalculator {
    static double calculate(double a, double b, char operator) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        } else if (operator == '%') {
            if (b == 0) {
                System.out.println("Modulo by zero is not allowed.");
                return 0;
            }
            return a % b;
        } else {
            System.out.println("Invalid operator.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);

        sc.close();
    }
}
