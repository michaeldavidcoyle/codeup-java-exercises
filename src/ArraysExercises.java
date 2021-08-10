import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // prints object reference
        System.out.println(Arrays.toString(numbers)); // prints array as string

        // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person[] people = new Person[3];
        people[0] = new Person("Larry");
        people[1] = new Person("Moe");
        people[2] = new Person("Curly");

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
