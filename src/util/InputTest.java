package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.print("Hello, what is your name? ");
//        String userName = input.getString();
//        System.out.printf("Pleasure to meet you, %s.%n", userName);
//
//        System.out.printf("%s, would you like to chat? ", userName);
//        boolean userWantChat = input.yesNo();
//
//        if (userWantChat) {
//            System.out.println("Great. Let's talk about numbers!");
//
//            System.out.printf("%s, what it your favorite integer? ", userName);
//            int userFavoriteInteger = input.getInt();
//            System.out.printf("Hmm, %d is a good one.%n", userFavoriteInteger);
//
//            int min = userFavoriteInteger + 1;
//            int max = min + 10;
//
//            System.out.printf("If you had to pick a number from %d to %d, what would you choose? ", min, max);
//            int userRangeInteger = input.getInt(min, max);
//            System.out.printf("Oh, %d. Interesting.%n", userRangeInteger);
//
//            System.out.printf("%s, what is a good real number? ", userName);
//            double userRealNumber = input.getDouble();
//
//            double minDouble = userRealNumber + 0.5;
//            double maxDouble = minDouble * Math.PI;
//
//            System.out.printf("Pick a number from %f to %f: ", minDouble, maxDouble);
//            double userRangeDouble = input.getDouble(minDouble, maxDouble);
//            System.out.println("Awesome number! Thanks for chatting.");
//        } else {
//            System.out.println("No problem, maybe some other time.");
//        }

//        System.out.print("What it your favorite integer? ");
//        int userFavoriteInteger = input.getInt();
//        System.out.printf("You chose the number %d. Thank you.%n", userFavoriteInteger);

//        System.out.print("Please select a whole number from 1 to 10: ");
//        int userInteger = input.getInt(1, 10);
//        System.out.printf("Thank you, %d is between 1 and 10.%n", userInteger);

//        System.out.print("Please enter a decimal number: ");
//        double userDouble = input.getDouble();
//        System.out.printf("You chose %f. Thank you.%n", userDouble);

//        double minDouble = 0.000001;
//        double maxDouble = (minDouble + 7) * Math.PI;
//
//        System.out.printf("Please enter a decimal number from %f to %f: ", minDouble, maxDouble);
//        double userDouble = input.getDouble(minDouble, maxDouble);
//        System.out.printf("You chose %f. Thank you.%n", userDouble);

//        String userName = input.getString("What is your name? ");
//        System.out.printf("Hello, %s, nice to meet you.", userName);

//        String userSentence = input.getSentence("Please enter a sentence: ");
//        System.out.printf("\"%s,\" eh? Interesting.", userSentence);

//        boolean userLovesMovies = input.yesNo("Do you love movies? [y/n] ");
//        if (userLovesMovies) {
//            System.out.println("Me too! Let's see what's on Netflix.");
//        } else {
//            System.out.println("Oh, that's too bad. We might have been friends.");
//        }

//        int userFavoriteWholeNumber = input.getInt("What it your favorite whole number? ");
//        System.out.printf("You chose the number %d. Thank you.%n", userFavoriteWholeNumber);

        int min = 10;
        int max = 99;
        int userIntInRange = input.getInt("What's a good two digit number? ", min, max);
        System.out.printf("%d, thanks. I'll remember that.", userIntInRange);
    }
}
