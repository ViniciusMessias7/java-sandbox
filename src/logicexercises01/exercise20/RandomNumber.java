package logicexercises01.exercise20;

// Create an algorithm that shows a random value between 0 and 100.
public class RandomNumber {
    public static void main(String[] args) {
        int randomNum;
        for (int i = 0; i < 100; i++) {
            randomNum = (int) (Math.random() * 100);
            System.out.println(randomNum);
        }
    }
}
