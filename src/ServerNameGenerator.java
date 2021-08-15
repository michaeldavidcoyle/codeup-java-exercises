import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServerNameGenerator {

    protected static String[] adjectives = {
            "flat", "round", "silly", "serious", "robust", "tired", "energetic", "viscous", "soupy", "arrogant",
            "humble", "blue", "sleepy", "average", "slow", "quick", "dangerous", "adorable", "courageous", "defiant"
    };

    protected static String[] nouns = {
            "boat", "desk", "phone", "camp", "bottle", "toy", "circle", "vector", "key", "horse",
            "beast", "hand", "collar", "pipe", "goat", "knight", "board", "net", "number", "wingnut"
    };

    public static String getRandomString(String[] stringsArray) {
        return stringsArray[ (int) (Math.random() * stringsArray.length) ];
    }

    public static void generateWordFiles() throws IOException {
        String directory = "data";
        String adjectives = "adjectives.txt";
        String nouns = "nouns.txt";

        Path dataDirectory = Paths.get(directory);
        Path adjectivesFile = Paths.get(directory, adjectives);
        Path nounsFile = Paths.get(directory, nouns);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(adjectivesFile)) {
            Files.createFile(adjectivesFile);
        }

        if (Files.notExists(nounsFile)) {
            Files.createFile(nounsFile);
        }
    }

    public static void main(String[] args) {
//        String serverName = getRandomString(adjectives) + '-' + getRandomString(nouns);
//        System.out.println(serverName);

        try {
            generateWordFiles();
        } catch (IOException e) {
            System.out.printf("Oops, something happened: %s%n", e.getMessage());
        }

        System.out.println("Success.");
    }
}
