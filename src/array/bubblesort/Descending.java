package array.bubblesort;

public class Descending {
    public static void main(String[] args) {
        int[] descending = new int[]{7, 5, 2, 0, 3, 9, 8, 6, 1, 4};

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
        System.out.println("=======---descending---=======");
        for (int i = 0; i < descending.length; i++) {
            if (i < descending.length - 1) {
                System.out.print("[" + descending[i] + "]");
                continue;
            }
            System.out.print("[" + descending[i]);
        }
        System.out.println("]");
        System.out.println("=======---descending---=======");

    }
}
