package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String fizzBuzz(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }

        if (input == 5) {
            return "Buzz";
        }

        return "";
    }
}
