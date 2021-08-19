import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import util.Input;

public class ServerNameGenerator {

    private static String directory = "data";
    private static Path dataDirectory = Paths.get(directory);

    private static String adjectives = "adjectives.txt";
    private static Path adjectivesFile = Paths.get(directory, adjectives);

    private static String nouns = "nouns.txt";
    private static Path nounsFile = Paths.get(directory, nouns);

    private static List<String> altAdjectives = Arrays.asList(
            "flat", "round", "silly", "serious", "robust", "tired", "energetic", "viscous", "soupy", "arrogant",
            "humble", "blue", "sleepy", "average", "slow", "quick", "dangerous", "adorable", "courageous", "defiant"
    );

    private static List<String> altNouns = Arrays.asList(
            "boat", "desk", "phone", "camp", "bottle", "toy", "circle", "vector", "key", "horse",
            "beast", "hand", "collar", "pipe", "goat", "knight", "board", "net", "number", "wingnut"
    );

    public static String getRandomString(List<String> stringsList) {
        return stringsList.get( (int) (Math.random() * stringsList.size()) );
    }

    public static Path generateAdjectivesFile() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(adjectivesFile)) {
            Files.createFile(adjectivesFile);
        }

        return adjectivesFile;
    }

    public static Path generateNounsFile() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(nounsFile)) {
            Files.createFile(nounsFile);
        }

        return nounsFile;
    }

    public static List<String> getAdjectives() {
        Path adjectivesFile;

        try {
            adjectivesFile = generateAdjectivesFile();
            return Files.readAllLines(adjectivesFile);
        } catch (IOException e) {
            System.out.printf("Oops, something happened: %s%n", e.getMessage());
            return altAdjectives;
        }
    }

    public static List<String> getNouns() {
        Path nounsFile;

        try {
            nounsFile = generateNounsFile();
            return Files.readAllLines(nounsFile);
        } catch (IOException e) {
            System.out.printf("Oops, something happened: %s%n", e.getMessage());
            return altNouns;
        }
    }

    public static void main(String[] args) {

        Input input = new Input();

        List<String> adjectivesList = getAdjectives();
        List<String> nounsList = getNouns();

        boolean continues = true;

        do {
            String randomAdjective = getRandomString(adjectivesList);
            String randomNoun = getRandomString(nounsList);

            System.out.printf("%s-%s%n", randomAdjective, randomNoun);

            continues = input.yesNo("Get another server name? [y/n] ");
        } while (continues);

        System.out.println("Thanks for using Server Name Generator. Goodbye.");
    }
}
