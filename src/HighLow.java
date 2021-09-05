import util.Input;

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
//        int maxGuessCount = 10;

//        boolean gameIsLost = false;

        System.out.printf("I've selected a number between 1 and %d.%n", max);

        int guess;

        do {
            guess = input.getInt("Guess my number: ", min, max);
            guessCount++;

//            if (guessCount == maxGuessCount && guess != myNumber) {
//                gameIsLost = true;
//                break;
//            }

            giveHint(guess, myNumber);

        } while (guess != myNumber);

//        if (gameIsLost) {
//            System.out.printf("Sorry, 10 guesses is the limit. My number was %d.%n", myNumber);
//        } else {
            System.out.println("Good guess!");
            System.out.printf("My number was %d. You made %d guesses.%n", myNumber, guessCount);
//        }
    }
}
