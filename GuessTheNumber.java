import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int attempts = 0;

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        do {
            // Prompt user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Check if the guess is correct
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else {
                // Provide hints
                if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

        } while (userGuess != targetNumber);

        // Close the scanner
        scanner.close();
    }
}
