package logicexercises01.exercise21;

import java.util.Scanner;

// Create an algorithm that reads two integer values A and B, and prints the
// quotient and the remainder of the integer division between them on the screen.
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (A): ");
        int valueA = scanner.nextInt();

        System.out.print("Enter an integer (B): ");
        int valueB = scanner.nextInt();

        scanner.close();

        int quotient = valueA / valueB;
        int reminder = valueA % valueB;

        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: " + reminder);
    }
}
