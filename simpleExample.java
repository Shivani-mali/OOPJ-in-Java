import java.util.*;
class simpleExample {

    // Method to demonstrate string operations
    public void stringOperations() {
        // Creating and initializing a string
        String greeting = "Hello, World!";

        // Displaying the length of the string
        System.out.println("Length of the string: " + greeting.length());

        // Converting the string to uppercase
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase: " + upperCaseGreeting);

        // Checking if the string contains a specific word
        boolean containsWorld = greeting.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Replacing a word in the string
        String replacedGreeting = greeting.replace("World", "Java");
        System.out.println("Replaced String: " + replacedGreeting);

        // Extracting a substring
        String substring = greeting.substring(7, 12);
        System.out.println("Substring: " + substring);
    }

    // Method to demonstrate Math operations
    public void mathOperations() {
        // Declaring variables
        double num1 = 25.0;
        double num2 = 4.0;

        // Calculating the square root
        double squareRoot = Math.sqrt(num1);
        System.out.println("Square Root of " + num1 + " is: " + squareRoot);

        // Calculating the power
        double power = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + power);

        // Finding the maximum and minimum of two numbers
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);

        // Generating a random number between 0 and 1
        double random = Math.random();
        System.out.println("Random number: " + random);
    }

    public static void main(String[] args) {
        // Creating an object of the class to call methods
        simpleExample example = new simpleExample();

        // Calling the method to demonstrate string operations
        example.stringOperations();

        // Calling the method to demonstrate Math operations
        example.mathOperations();
    }
}
