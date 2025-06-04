package logicexercises01.exercise22;

import java.util.Scanner;

// Create an algorithm that calculates a teacher's net salary. The information
// provided will be: value per class hour, number of classes taught in the month, and
// INSS (Social Security) discount percentage. Print the final net salary on the
// screen
public class NetSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Earnings per hour (class): ");
        double earnPerHour = scanner.nextDouble();

        System.out.print("Number of class in this month: ");
        double classMonth = scanner.nextDouble();

        double earnTotalSalary = earnPerHour * classMonth;
        double netSalaryTeacher = setNetSalaryTeacher(earnTotalSalary);
        System.out.println("Your net salary this month will be: " + netSalaryTeacher);
    }

    private static double setNetSalaryTeacher(double earnTotalSalary) {
        double socialSecurity;

        if (earnTotalSalary <= 1518.0) {
            socialSecurity = earnTotalSalary * 0.075;
        } else if (earnTotalSalary >= 1518.01 && earnTotalSalary <= 2793.88) {
            socialSecurity = earnTotalSalary * 0.09;
        } else if (earnTotalSalary >= 2793.89 && earnTotalSalary <= 4190.83) {
            socialSecurity = earnTotalSalary * 0.12;
        } else {
            socialSecurity = earnTotalSalary * 0.14;
        }

        return earnTotalSalary - socialSecurity;
    }
}
