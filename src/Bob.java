import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /*
        * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        * He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        * He answers 'Whatever.' to anything else.
        * Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        */

        Scanner input = new Scanner(System.in);

        boolean userWantsToConinue = true;

        System.out.println("Talk to Bob! [type 'end' to quit]");

        do {
            System.out.print("You: ");
            String userStatement = input.nextLine();

            String bobsAnswer = "Whatever.";

            if (userStatement.endsWith("?")) {
                bobsAnswer = "Sure.";
            } else if (userStatement.endsWith("!")) {
                bobsAnswer = "Whoa, chill out!";
            } else if (userStatement.equals("")) {
                bobsAnswer = "Fine. Be that way!";
            } else if (userStatement.equals("end")) {
                userWantsToConinue = false;
            }

            System.out.printf("Bob: %s%n", bobsAnswer);
        } while (userWantsToConinue);
    }
}
