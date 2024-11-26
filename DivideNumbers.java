import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the numerator (dividend): ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator (divisor): ");
        double denominator = scanner.nextDouble();

        // Check if the denominator is zero to avoid division by zero error
        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Perform the division
            double result = numerator / denominator;

            // Display the result
            System.out.println("The result of dividing " + numerator + " by " + denominator + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }

