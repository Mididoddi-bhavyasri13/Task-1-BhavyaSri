import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        char playAgain;
        do {
            int target = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");
            while (attempts < maxAttempts && !guessedCorrectly) {
                try {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    attempts++;
                    if (guess == target) {
                        System.out.println("Correct! You guessed the number.");
                        guessedCorrectly = true;
                        int roundScore = (maxAttempts - attempts + 1) * 10;
                        totalScore += roundScore;
                        System.out.println("Attempts used: " + attempts);
                        System.out.println("Round Score: " + roundScore);
                    } else if (guess < target) {
                        System.out.println("Too Low!");
                    } else {
                        System.out.println("Too High!");
                    }
                    if (!guessedCorrectly) {
                        System.out.println("Attempts Left: " + (maxAttempts - attempts));
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.next(); 
                }
            }
            if (!guessedCorrectly) {
                System.out.println("\nYou Lost!");
                System.out.println("The correct number was: " + target);
            }
            System.out.println("Total Score: " + totalScore);
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println("\n===== GAME OVER =====");
        System.out.println("Final Score: " + totalScore);
        System.out.println("I Hope You Enjoyed This Game!");
        System.out.println("Thank You For Playing!");
        sc.close();
    }
}