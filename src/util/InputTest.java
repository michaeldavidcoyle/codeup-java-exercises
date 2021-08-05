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
            System.out.println("Great. Let's talk!");

            System.out.printf("%s, what it your favorite integer? ", userName);
            int userFavoriteInteger = input.getInt();
            System.out.printf("Hmm, %d is a good one.", userFavoriteInteger);
        } else {
            System.out.println("No problem, maybe some other time.");
        }
    }
}
