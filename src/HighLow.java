import java.lang.reflect.Method;

public class HighLow {
    public static void main(String[] args) {
        int myNumber = MethodsExercises.randomInteger(1, 100);
        int guess;

        do {
            guess = MethodsExercises.getInteger(1, 100);

            if (guess < myNumber) {
                System.out.println("Higher");
            } else if (guess > myNumber) {
                System.out.println("Lower");
            }
        } while (guess != myNumber);

        System.out.printf("Good guess! My number was %d.%n", myNumber);
    }
}
