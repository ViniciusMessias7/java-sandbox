package logicexercises01.exercise06;

import java.util.Scanner;

// Create an algorithm that reads any value and prints it on the screen with a 5% adjustment

public class Adjustment {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        double value = userInput.nextInt();
        userInput.nextLine();

        userInput.close();

        double adjustment = value + (value * 0.05);

        System.out.println("Value after an 5% adjustment: " + adjustment);
    }
}
