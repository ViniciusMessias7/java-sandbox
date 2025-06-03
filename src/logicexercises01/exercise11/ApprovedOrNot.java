package logicexercises01.exercise11;

import java.util.Scanner;

// Create an algorithm that reads four grades obtained by a student, calculates
// the average of the grades obtained, prints the student's name on the screen, and
// indicates if the student was approved or disapproved. For the student to be
// considered approved, their final average must be greater than or equal to 7
public class ApprovedOrNot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] grades = new double[4];

        System.out.print("Student name: ");
        String studentName = userInput.nextLine();

        System.out.print("Enter grade (1/4): ");
        grades[0] = userInput.nextDouble();

        System.out.print("Enter grade (2/4): ");
        grades[1] = userInput.nextDouble();

        System.out.print("Enter grade (3/4): ");
        grades[2] = userInput.nextDouble();

        System.out.print("Enter grade (4/4): ");
        grades[3] = userInput.nextDouble();

        userInput.close();

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;

        System.out.print("Student name: " + studentName);
        System.out.println();

        if (average >= 7) {
            System.out.println("Average: " + average + "\n✅ Congratulations! You are APPROVED.");
        } else {
            System.out.println("Average: " + average + "\n❎ Sorry! You are DISAPPROVED.");
        }
    }
}
