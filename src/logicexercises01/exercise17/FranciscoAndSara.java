package logicexercises01.exercise17;
// Francisco is 1.50m tall and grows 2 centimeters per year, while Sara is 1.10m tall
// and grows 3 centimeters per year. Create an algorithm that calculates and prints
// on the screen how many years it will take for Sara to be taller than Francisco.

public class FranciscoAndSara {
    public static void main(String[] args) {
        double franciscoHeight = 1.50;
        double saraHeight = 1.10;
        int year = 0;

        for (int i = 1; saraHeight <= franciscoHeight; i++) {
            franciscoHeight += 0.02;
            saraHeight += 0.03;
            year = i;
        }

        System.out.println(year + " years for Sara be more taller than Francisco.");
    }
}
