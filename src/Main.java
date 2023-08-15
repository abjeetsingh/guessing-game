import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100) + 1;
            int guess = 0;
            int numGuesses = 0;

            System.out.println("Guess a number between 1 and 100!");

            while (guess != numberToGuess) {
                guess = input.nextInt();
                numGuesses++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Guess again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Guess again.");
                }
            }

            System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
        }
    }
}