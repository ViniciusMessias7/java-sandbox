package logicexercises01.exercise10;

import java.util.Scanner;

// Create an algorithm that reads three grades obtained by a student and prints
// the average of the grades on the screen.
public class AverageGrade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] grades = new double[3];

        System.out.print("Enter grade (1/3): ");
        grades[0] = userInput.nextDouble();

        System.out.print("Enter grade (2/3): ");
        grades[1] = userInput.nextDouble();

        System.out.print("Enter grade (3/3): ");
        grades[2] = userInput.nextDouble();

        userInput.close();

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;
        System.out.println(average);
    }
}
