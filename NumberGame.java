import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean playAgain = true;
        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");
        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 8;
            boolean guessedCorrectly = false;
            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");
            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);
                    int score = (maxAttempts - attempts + 1) * 10;
                    totalScore += score;
                    System.out.println("Round Score: " + score);
                    guessedCorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }
            if (!guessedCorrectly) {
                System.out.println("\nYou used all your attempts.");
                System.out.println("The correct number was: " + number);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
        System.out.println("\n=================================");
        System.out.println("          GAME OVER");
        System.out.println("=================================");
        System.out.println("Total Score: " + totalScore);
        scanner.close();
    }
}