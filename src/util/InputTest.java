package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Hello, what is your name? ");
        String userName = input.getString();

        System.out.printf("Pleasure to meet you, %s.%n", userName);
    }
}
