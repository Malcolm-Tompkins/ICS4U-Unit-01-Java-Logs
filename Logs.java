/*
*  World!" program, just proves you can show print to terminal.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since 2020-11-18
*/

// Imports the scanner class
import java.util.Scanner;
/**
* Calculates the number of logs needed to fill a truck.
*/

final class Logs {
    /**
    * Constants for total mass the truck can hold.
    */
    public static final float TOTAL_MASS_OF_TRUCK = 1100;

    /**
    * Constant for mass of the maple logs.
    */
    public static final float MASS_OF_LOGS = 20;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Input the size of logs (0.25m, 0.5m, 1m): ");
        final float logSize = myObj.nextFloat();

        // Process
        final float numberOfLogs = TOTAL_MASS_OF_TRUCK / logSize / MASS_OF_LOGS;

        // Output

        System.out.println("The number of logs required to fill the truck is: " + numberOfLogs);
        System.out.println("\nDone.");
    }
}

