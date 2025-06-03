package logicexercises01.exercise02;

import java.util.Scanner;

// Create an algorithm to receive any number and print on the screen whether the
// number is even or odd, positive, neutral or negative.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int numberEntered = userInput.nextInt();

        userInput.close();

        String message;
        if (numberEntered % 2 == 0) {
            message = "The number you entered '" + numberEntered + "' is even";
        } else {
            message = "The number you entered '" + numberEntered + "' is odd";
        }

        if (numberEntered > 0) {
            message += " and positive.";
        } else if (numberEntered == 0) {
            message += " and neutral.";
        } else {
            message += " and negative.";
        }

        System.out.println(message);
    }
}
