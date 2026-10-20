import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("=== Welcome to the Number Game ===");
        System.out.println("I've chosen a number between 1 and 100. Try to guess it!");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess > randomNumber) {
                System.out.println("Too High! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}