package org.example;

import java.util.Scanner;

/**
 * Utility class for handling and validating user input.
 * Provides methods for getting validated numeric input from users.
 */
public class InputHandler {
    /**
     * Scanner instance for reading user input.
     * Static to avoid multiple scanner instances.
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Gets and validates integer input from user.
     * Continues prompting until valid input is received.
     *
     * @param minValue minimum acceptable value
     * @return validated integer input
     * @throws IllegalStateException if scanner is closed
     */
    public static int getUserInput(int minValue) {
        int input;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number");
                scanner.next();
            }
            input = scanner.nextInt();
            
            if (input < minValue) {
                System.out.printf("Error: Value must be at least %d%n", minValue);
            }
        } while (input < minValue);
        
        return input;
    }
}
