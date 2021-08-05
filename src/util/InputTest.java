package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Hello, what is your name? ");
        String userName = input.getString();
        System.out.printf("Pleasure to meet you, %s.%n", userName);

        System.out.printf("%s, would you like to chat? ", userName);
        boolean userWantChat = input.yesNo();

        if (userWantChat) {
            System.out.println("Great. Let's talk about numbers!");

            System.out.printf("%s, what it your favorite integer? ", userName);
            int userFavoriteInteger = input.getInt();
            System.out.printf("Hmm, %d is a good one.%n", userFavoriteInteger);

            int min = userFavoriteInteger + 1;
            int max = min + 10;

            System.out.printf("If you had to pick a number from %d to %d, what would you choose? ", min, max);
            int userRangeInteger = input.getInt(min, max);
            System.out.printf("Oh, %d. Interesting.%n", userRangeInteger);

            System.out.printf("%s, what is a good real number? ", userName);
            double userRealNumber = input.getDouble();

            double minDouble = userRealNumber + 0.5;
            double maxDouble = minDouble * Math.PI;

            System.out.printf("Pick a number from %f to %f: ", minDouble, maxDouble);
            double userRangeDouble = input.getDouble(minDouble, maxDouble);
            System.out.println("Awesome number! Thanks for chatting.");
        } else {
            System.out.println("No problem, maybe some other time.");
        }
    }
}
