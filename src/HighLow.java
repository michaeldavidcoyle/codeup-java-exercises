import java.lang.reflect.Method;

public class HighLow {
    public static void main(String[] args) {
        int myNumber = MethodsExercises.randomInteger(1, 100);
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
            } else if (guess < myNumber) {
                System.out.println("Higher");
            } else if (guess > myNumber) {
                System.out.println("Lower");
            }
        } while (guess != myNumber);

        if (gameIsLost) {
            System.out.printf("Sorry, 10 guesses is the limit. My number was %d.%n", myNumber);
        } else {
            System.out.println("Good guess!");
            System.out.printf("My number was %d. You made %d guesses.%n", myNumber, guessCount);
        }
    }
}
