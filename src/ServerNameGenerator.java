public class ServerNameGenerator {

    protected String[] adjectives = {
            "flat", "round", "silly", "serious", "robust", "tired", "energetic", "viscous", "soupy", "arrogant",
            "humble", "blue", "sleepy", "average", "slow", "quick", "dangerous", "adorable", "courageous", "defiant"
    };

    protected String[] nouns = {
            "boat", "desk", "phone", "camp", "bottle", "toy", "circle", "vector", "key", "horse",
            "beast", "hand", "collar", "pipe", "goat", "knight", "board", "net", "number", "wingnut"
    };

    public static String getRandomString(String[] stringsArray) {
        return stringsArray[ MethodsExercises.randomInteger(0, stringsArray.length - 1) ];
    }
}
