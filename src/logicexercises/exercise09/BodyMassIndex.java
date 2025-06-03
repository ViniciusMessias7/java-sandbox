package logicexercises.exercise09;

import java.util.Scanner;

// Create an algorithm that calculates a person's BMI (Body Mass Index), reads their weight and height
// and prints their condition on the screen
// BMI Formula = weight / (height)²
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type your weight: ");
        double weight = userInput.nextDouble();

        System.out.print("Type your height: ");
        double height = userInput.nextDouble();

        double formula = weight / (height * height);

        String result;

        if (formula <= 18.5) {
            result = "Underweight";
        } else if (formula >= 18.6 && formula <= 24.9) {
            result = "Ideal weight (congratulations 😁)";
        } else if (formula >= 25.0 && formula <= 29.9) {
            result = "Slightly overweight";
        } else if (formula >= 30.0 && formula <= 34.9) {
            result = "Obesity grade I";
        } else if (formula >= 35.0 && formula <= 39.9) {
            result = "Obesity grade II (severe)";
        } else {
            result = "Obesity grade III (morbid)";
        }

        System.out.println(result);
    }
}
