package logicexercises01.exercise13;

import java.util.Scanner;

// Create an algorithm that reads a person's name and age and prints the person's
// name on the screen and whether they are of legal age or a minor
public class LegalAgeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        String msg;
        if (age >= 18) {
            msg = userName + ", you of legal age!";
        } else {
            msg = age + ", you are a minor!";
        }

        System.out.println(msg);
    }
}
