package array;
// Implement the Bubble Sort algorithm in Java using this array:
// int[] array = new int[]{2, 5, 7, 1, 4, 8, 9, 10, 3, 6};

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[]{7, 5, 2, 0, 3, 9, 8, 6, 1, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("##########BUBBLE SORT##########");
        System.out.println("=======---ascending---=======");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print("[" + numbers[i] + "]");
            } else {
                System.out.print("[" + numbers[i]);
            }
        }
        System.out.println("]");
        System.out.println("=======---ascending---=======");
        System.out.println();
        numbers = new int[]{7, 5, 2, 0, 3, 9, 8, 6, 1, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("=======---descending---=======");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print("[" + numbers[i] + "]");
            } else {
                System.out.print("[" + numbers[i]);
            }
        }
        System.out.println("]");
        System.out.println("=======---descending---=======");

    }
}
