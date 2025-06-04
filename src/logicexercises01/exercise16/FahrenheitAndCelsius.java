package logicexercises01.exercise16;

import java.util.Scanner;

// Create an algorithm that reads a temperature in Fahrenheit and calculates the
// corresponding temperature in Celsius. Print both temperatures on the screen.
// Formula: C=(5×(F−32)/9)
public class FahrenheitAndCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fahrenheit temp: ");
        double fahrenheit = scanner.nextDouble();
        double formFahToCel = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " °F");
        System.out.println(formFahToCel + " °C");
    }
}
