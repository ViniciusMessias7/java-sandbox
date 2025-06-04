package logicexercises01.exercise14;

import java.util.Scanner;

// Create an algorithm that receives values A and B, swaps the value of A with B
// and the value of B with A, and prints the values on the screen.
public class SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value (A): ");
        int valueA = scanner.nextInt();

        System.out.print("Enter value (B): ");
        int valueB = scanner.nextInt();

        int temp = valueA;
        valueA = valueB;
        valueB = temp;

        System.out.println();

        System.out.println("Swaping values...");
        System.out.println("Value (A): " + valueA);
        System.out.println("Value (B): " + valueB);
    }
}
