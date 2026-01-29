public class BubbleSort {

    public static void main(String[] args) {

        int x[] = {38, 20, 25, 9, 8, 44, 6};
        int n = x.length;
        int i, j, temp;

        System.out.print("\nUnsorted Array is :");
        for (i = 0; i < n; i++) {
            System.out.print("\n x[" + i + "]=" + x[i]);
        }

        // Bubble Sort Logic
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted Array is :");
        for (i = 0; i < n; i++) {
            System.out.print("\n x[" + i + "]=" + x[i]);
        }
    }
}
