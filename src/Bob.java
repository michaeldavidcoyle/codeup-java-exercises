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

        do {
            System.out.print("Would you like to talk to Bob? [y/n] ");
            String userResponse = input.next();

            if (!userResponse.toLowerCase().contains("y")) {
                userWantsToConinue = false;
            }
        } while (userWantsToConinue);
    }
}
