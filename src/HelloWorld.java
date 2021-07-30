public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        // Don't do this, reserved word
//        String class = "Today's class covered Java data types and variables.";

        // Gives ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        incompatible types: java.lang.String cannot be converted to int
//        int three = (int) "three";

        // Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
        // shorthand
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;
        // shorthand
//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        // shorthand
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        // What happens if you assign a value to a numerical variable that is larger (or smaller) than
        // the type can hold? What happens if you increment a numeric variable past the type's capacity?
        int n = Integer.MAX_VALUE + 1;
        System.out.println(n); // goes negative: -2147483648

        int m = Integer.MAX_VALUE;
        m++;
        System.out.println(m); // also goes negative: -2147483648
    }
}
