package logicexercises.exercise04;

// Create an algorithm that receives an integer and prints its predecessor and successor on the screen.

import java.util.Scanner;

public class PredecessorAndSuccessor {

    private static String predecessorAndSuccessorString(int number) {
        String predecessorStr = "Predecessor: " + (number - 1);
        String successorStr = "Successor: " + (number + 1);

        return predecessorStr + "\n" + successorStr;
    }

    private static void predecessorAndSuccessorVoid(int number) {
        String predecessorStr = "Predecessor: " + (number - 1);
        String successorStr = "Successor: " + (number + 1);

        System.out.println(predecessorStr + "\n" + successorStr);
    }

    private static int predecessorIntMethod(int number) {
        return number - 1;
    }

    private static int successorIntMethod(int number) {
        return number + 1;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();

        userInput.close();

        int predecessor = number - 1;
        int successor = number + 1;
        System.out.println("Predecessor: " + predecessor);
        System.out.println("Successor: " + successor);

        System.out.println("=================================");

        predecessor = number;
        successor = number;
        System.out.println("Predecessor: " + --predecessor);
        System.out.println("Successor: " + ++successor);

        System.out.println("=================================");

        System.out.println("Predecessor: " + (number - 1));
        System.out.println("Successor: " + (number + 1));

        System.out.println("=================================");

        if (number - 1 < number && number + 1 > number) {
            System.out.println("Predecessor: " + (number - 1));
            System.out.println("Successor: " + (number + 1));
        } else {
            System.out.println("What????? 😂");
        }

        System.out.println("=================================");

        String predecessorStr = "Predecessor: " + (number - 1);
        String successorStr = "Successor: " + (number + 1);

        System.out.println(predecessorStr + "\n" + successorStr);

        System.out.println("=================================");

        String result = predecessorAndSuccessorString(number);
        System.out.println(result);

        System.out.println("=================================");

        predecessorAndSuccessorVoid(number);

        System.out.println("=================================");

        int predecessor2 = predecessorIntMethod(number);
        int successor2 = successorIntMethod(number);
        System.out.println("Predecessor: " + predecessor2);
        System.out.println("Successor: " + successor2);

        System.out.println("=================================");
    }
}
