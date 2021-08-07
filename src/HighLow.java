import java.lang.reflect.Method;

public class HighLow {
    public static void main(String[] args) {
        int myNumber = MethodsExercises.randomInteger(1, 100);
        int guess = MethodsExercises.getInteger(1, 100);

        System.out.printf("You guessed: %d", guess);
    }
}
