package logicexercises01.exercise01;

import java.util.Scanner;

// Create an algorithm that reads the values of A, B, and C.
// Then prints the sum of A and B to the screen and shows if the sum is less than C.
public class SumComparison {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer 'a': ");
        int valueA = userInput.nextInt();

        System.out.print("Enter an integer 'b': ");
        int valueB = userInput.nextInt();

        System.out.print("Enter an integer 'c': ");
        int valueC = userInput.nextInt();

        userInput.close();

        int sumOfAAndB = (valueA + valueB);
        System.out.println("The sum between 'a' + 'b' is " + sumOfAAndB + ".");

        if (sumOfAAndB < valueC) {
            System.out.println("The sum of both is less than 'c': " + valueC + ".");
        }
    }
}
