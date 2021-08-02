public class ControlFlowExercises {
    public static void main(String[] args) {
        // c. For
        // Create a for loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // Alter your loop to count backwards by 5's from 100 to -10.
        // Create a for loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        // 2
        // 4
        // 16
        // 256
        // 65536
        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }
    }
}
