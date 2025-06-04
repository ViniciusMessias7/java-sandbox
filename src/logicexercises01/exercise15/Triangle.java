package logicexercises01.exercise15;

import java.util.Scanner;

// Create an algorithm that reads three values representing the three sides of a triangle
// and verifies if they are valid. Determine if the triangle is equilateral, isosceles, or scalene.
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value of a triangle side (1/3): ");
        int sideOne = scanner.nextInt();

        System.out.print("Enter a value of a triangle side (2/3): ");
        int sideTwo = scanner.nextInt();

        System.out.print("Enter a value of a triangle side (3/3): ");
        int sideThree = scanner.nextInt();

        if (sideOne == sideTwo & sideOne == sideThree & sideTwo == sideThree) {
            System.out.println("This triangle is equilateral.");
        } else if (sideOne == sideTwo) {
            System.out.println("This triangle is isosceles.");
        } else if (sideTwo == sideThree) {
            System.out.println("This trangle is isosceles.");
        } else if (sideOne == sideThree) {
            System.out.println("This trangle is isosceles.");
        } else {
            System.out.println("This trangle is scalene.");
        }

    }
}
