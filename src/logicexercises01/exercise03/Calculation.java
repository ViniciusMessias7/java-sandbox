package logicexercises01.exercise03;

// Create an algorithm that reads two integer values A and B.
// If the values of A and B are equal, it should sum the two values; otherwise, it should multiply A by B.
// At the end of either calculation, the result should be assigned to a variable C, and its value printed on the screen

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer 'a': ");
        int valueA = userInput.nextInt();

        System.out.print("Enter an integer 'b': ");
        int valueB = userInput.nextInt();

        userInput.close();

        int valueC;
        if (valueA == valueB) {
            valueC = (valueA + valueB);
        } else {
            valueC = (valueA * valueB);
        }

        System.out.println("The value of 'c' is " + valueC);
    }
}
