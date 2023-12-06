import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Check for division by zero
        double quotient = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Close the scanner
        scanner.close();
    }
}
