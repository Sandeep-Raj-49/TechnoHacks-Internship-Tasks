import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number, which is " + targetNumber);
                System.out.println("Number of attempts: " + attempts);
            } else {
                // Provide hints to the user
                if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }
        }
    }
}
