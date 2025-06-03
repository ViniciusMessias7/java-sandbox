package logicexercises01.exercise08;

import java.util.Scanner;

// Create an algorithm that reads three different integer values and prints the values on the screen in descending order
public class DescendingOrder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] values = new int[3];
        System.out.print("Enter an integer (1/3): ");
        values[0] = userInput.nextInt();

        System.out.print("Enter an integer (2/3): ");
        values[1] = userInput.nextInt();

        System.out.print("Enter an integer (3/3): ");
        values[2] = userInput.nextInt();

        userInput.close();

        // Bubble Sort descending order
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] < values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        System.out.println("Descending order: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
