package logicexercises01.exercise07;

// Create an algorithm that reads two boolean (logical) values and determines if
// both are TRUE or FALSE.

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an boolean (True or False): ");
        boolean value1 = userInput.nextBoolean();

        System.out.print("Enter another boolean (True or False): ");
        boolean value2 = userInput.nextBoolean();

        userInput.close();

        if (value1 && value2) {
            System.out.println("Both are true");
        } else if (!value1 && !value2) {
            System.out.println("Both are false");
        } else {
            System.out.println("Different values (one is " + value1 + " and the other is " + value2 + ")");
        }
    }
}
