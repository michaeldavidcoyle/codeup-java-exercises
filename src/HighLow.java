import util.Input;

public class HighLow {
    public static Input input = new Input;

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
        int myNumber = randomInteger(1, 100);
        int guessCount = 0;
        int maxGuessCount = 10;
        boolean gameIsLost = false;
        int guess;

        do {
            guess = MethodsExercises.getInteger(1, 100);
            guessCount++;

            if (guessCount == maxGuessCount && guess != myNumber) {
                gameIsLost = true;
                break;
            }

            giveHint(guess, myNumber);

        } while (guess != myNumber);

        if (gameIsLost) {
            System.out.printf("Sorry, 10 guesses is the limit. My number was %d.%n", myNumber);
        } else {
            System.out.println("Good guess!");
            System.out.printf("My number was %d. You made %d guesses.%n", myNumber, guessCount);
        }
    }
}
