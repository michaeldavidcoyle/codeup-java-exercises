import util.Input;
import util.MathHelpers;

public class HighLow {
    public static Input input = new Input();

    public static void giveHint(int guess, int actual) {
        if (guess < actual) {
            System.out.println("Higher");
        } else if (guess > actual) {
            System.out.println("Lower");
        }
    }

    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        System.out.println("Let's play the High/Low Game!");
        System.out.println("The minimum number is always 1.");

        int min = 1;
        int max = input.getInt("Choose a maximum number: ");

        int myNumber = randomInteger(min, max);

        int guessCount = 0;

        // Optimum play suggests an average of log2(max) guesses.
        double averageGuesses = MathHelpers.logBaseN(2, max);
        double maxGuessCount = Math.ceil(averageGuesses * 1.25);

        boolean gameIsLost = false;

        System.out.printf("I've selected a number between 1 and %d.%n", max);

        int guess;

        do {
            guess = input.getInt("Guess my number: ", min, max);
            guessCount++;

            if (guessCount == maxGuessCount && guess != myNumber) {
                gameIsLost = true;
                break;
            }

            giveHint(guess, myNumber);

        } while (guess != myNumber);

        if (gameIsLost) {
            System.out.printf(
                    "Sorry, %d guesses is the limit for a range of 1 to %d.%nMy number was %d.%n",
                    (int) maxGuessCount,
                    max,
                    myNumber
            );
        } else {
            System.out.println("Good guess!");
            System.out.printf(
                    "My number was %d.%nYou made %d guesses.%nAverage for this range is %d guesses.",
                    myNumber,
                    guessCount,
                    Math.round(averageGuesses)
            );
        }
    }
}
