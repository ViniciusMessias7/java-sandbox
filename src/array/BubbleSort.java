package array;
// Implement the Bubble Sort algorithm in Java using this array:
// int[] array = new int[]{2, 5, 7, 1, 4, 8, 9, 10, 3, 6};

public class BubbleSort {
    public static void main(String[] args) {

        int[] ascending = new int[]{7, 5, 2, 0, 3, 9, 8, 6, 1, 4};
        int[] descending = new int[]{7, 5, 2, 0, 3, 9, 8, 6, 1, 4};

        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = 0; j < ascending.length - 1 - i; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temp = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }

        System.out.println("##########BUBBLE SORT##########");
        System.out.println("=======---ascending---=======");
        for (int i = 0; i < ascending.length; i++) {
            if (i < ascending.length - 1) {
                System.out.print("[" + ascending[i] + "]");
            } else {
                System.out.print("[" + ascending[i]);
            }
        }
        System.out.println("]");
        System.out.println("=======---ascending---=======");

        System.out.println("=======---descending---=======");
        for (int i = 0; i < descending.length; i++) {
            if (i < descending.length - 1) {
                System.out.print("[" + descending[i] + "]");
            } else {
                System.out.print("[" + descending[i]);
            }
        }
        System.out.println("]");
        System.out.println("=======---descending---=======");

    }
}
