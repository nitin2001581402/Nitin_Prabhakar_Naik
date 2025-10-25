// Problem-1.java
import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);
        System.out.println("Result: " + calc.calculate());
        sc.close();
    }
}
