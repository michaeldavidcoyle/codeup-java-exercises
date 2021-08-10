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
        return stringsArray[ MethodsExercises.randomInteger(0, stringsArray.length - 1) ];
    }

    public static void main(String[] args) {
        String serverName = getRandomString(adjectives) + '-' + getRandomString(nouns);
        System.out.println(serverName);
    }
}
