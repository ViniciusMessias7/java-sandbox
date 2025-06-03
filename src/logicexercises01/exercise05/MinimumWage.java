package logicexercises01.exercise05;

import java.util.Scanner;

// Create an algorithm that reads the minimum wage value and a user's salary value
// calculates how many minimum wages this user earns, and prints the result on the screen.
// (Base for minimum wage R$1,293.20)
public class MinimumWage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your current salary value: ");
        double userSalary = input.nextDouble();
        double minimumWage = 1293.20;

        double diffSalaryOverMinimumWage = (userSalary / minimumWage);

        String result;
        if (userSalary >= minimumWage) {
            result = "User receives a total of: " + diffSalaryOverMinimumWage + " minimum wages";
        } else {
            result = "User receive a salary of " + userSalary + " that is below the minimum wage: " + minimumWage;
        }

        System.out.println(result);
    }
}
