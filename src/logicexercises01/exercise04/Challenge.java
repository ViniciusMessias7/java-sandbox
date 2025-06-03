package logicexercises01.exercise04;

import java.util.Scanner;

public class Challenge {

    private static int[] predecessorAndSuccessor(int number) {
        return new int[]{number + 1, number - 1};
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        char command = ' ';
        int number;
        System.out.println("Enter an integer:");

        while (true) {
            System.out.print("> ");
            if (userInput.hasNextInt()) {
                number = userInput.nextInt();
                break;
            } else {
                System.out.println("Wrong value!, please try again");
                userInput.next();
            }
        }
        userInput.nextLine();
        System.out.println();

        System.out.println("============== 😊 ==============");
        while (command != '0') {
            System.out.println("Press 1 to show your typed number in successor");
            System.out.println("Press 2 to show your typed number in predecessor");
            System.out.println("Press 3 to show your typed number in both ways");
            System.out.println("Press 0 to exit");
            System.out.print("> ");
            String userInputStr = userInput.nextLine();

            if (userInputStr.length() != 1) {
                System.out.println("\nWrong command!, please try again: ");
                System.out.println();
                continue;
            }
            command = userInputStr.charAt(0);

            switch (command) {
                case '1':
                    int[] successor = predecessorAndSuccessor(number);
                    System.out.println();
                    System.out.println("==============");
                    System.out.println("Integer: " + number);
                    System.out.println("Successor: " + successor[0]);
                    System.out.println("==============");
                    System.out.println();
                    break;
                case '2':
                    int[] predecessor = predecessorAndSuccessor(number);
                    System.out.println();
                    System.out.println("==============");
                    System.out.println("Integer: " + number);
                    System.out.println("Predecessor: " + predecessor[1]);
                    System.out.println("==============");
                    System.out.println();
                    break;
                case '3':
                    int[] arrayPreAndSuc = predecessorAndSuccessor(number);
                    System.out.println();
                    System.out.println("==============");
                    System.out.println("Integer: " + number);
                    System.out.println("Successor: " + arrayPreAndSuc[0] + "\n" + "Predecessor: " + arrayPreAndSuc[1]);
                    System.out.println("==============");
                    System.out.println();
                    break;
                case '0':
                    System.out.println("GoodBye 😁");
                    break;
                default:
                    System.out.println("\nWrong command!, please try again: ");
                    System.out.println();
            }
        }
        System.out.println("============== 😊 ==============");
    }
}
