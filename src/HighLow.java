import java.lang.reflect.Method;

public class HighLow {
    public static void main(String[] args) {
        int myNumber = MethodsExercises.randomInteger(1, 100);
        int guessCount = 0;
        int guess;

        do {
            guess = MethodsExercises.getInteger(1, 100);
            guessCount++;

            if (guess < myNumber) {
                System.out.println("Higher");
            } else if (guess > myNumber) {
                System.out.println("Lower");
            }
        } while (guess != myNumber);

        System.out.println("Good guess!");
        System.out.printf("My number was %d. You made %d guesses.%n", myNumber, guessCount);
    }
}
