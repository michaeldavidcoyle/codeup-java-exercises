//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ServerNameGenerator {
//
//    protected static String[] adjectives = {
//            "flat", "round", "silly", "serious", "robust", "tired", "energetic", "viscous", "soupy", "arrogant",
//            "humble", "blue", "sleepy", "average", "slow", "quick", "dangerous", "adorable", "courageous", "defiant"
//    };
//
//    protected static String[] nouns = {
//            "boat", "desk", "phone", "camp", "bottle", "toy", "circle", "vector", "key", "horse",
//            "beast", "hand", "collar", "pipe", "goat", "knight", "board", "net", "number", "wingnut"
//    };
//
//    public static String getRandomString(String[] stringsArray) {
//        return stringsArray[ (int) (Math.random() * stringsArray.length) ];
//    }
//
//    public static Path generateAdjectivesFile() throws IOException {
//        String directory = "data";
//        String adjectives = "adjectives.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path adjectivesFile = Paths.get(directory, adjectives);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (Files.notExists(adjectivesFile)) {
//            Files.createFile(adjectivesFile);
//        }
//
//        return adjectivesFile;
//    }
//
//    public static Path generateNounsFile() throws IOException {
//        String directory = "data";
//        String nouns = "nouns.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path nounsFile = Paths.get(directory, nouns);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (Files.notExists(nounsFile)) {
//            Files.createFile(nounsFile);
//        }
//
//        return nounsFile;
//    }
//
//    public static ArrayList<String> getAdjectives() {
//        Path adjectivesFile;
//        List<String> adjectivesList;
//        try {
//            adjectivesFile = generateAdjectivesFile();
//            adjectivesList = Files.readAllLines(adjectivesFile);
//        } catch (IOException e) {
//            System.out.printf("Oops, something happened: %s%n", e.getMessage());
//        }
//
//        List<String> lines = Arrays.asList("testing: 1, 5, 3", "testing: 2, 7, 4"); // create new List of strings
//        Files.write(contactFile, lines);
//    }
//
//    public static void main(String[] args) {
////        String serverName = getRandomString(adjectives) + '-' + getRandomString(nouns);
////        System.out.println(serverName);
//
//        try {
//            generateAdjectivesFile();
//            generateNounsFile();
//        } catch (IOException e) {
//            System.out.printf("Oops, something happened: %s%n", e.getMessage());
//        }
//
//        System.out.println("Success.");
//    }
//}
