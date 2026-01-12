public class LinearSearch {
    public static void LinearSearch(int A[], int n, int item) {
        for (int i = 0; i < n; i++) {
            if (item == A[i]) {
                System.out.format("Item %d found at position %d\n", item, i);
                return;
            }
        }
        System.out.format("Item %d not found\n", item);
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 55, 77, 89, 90};
        int n = A.length;
        int item = 55;
        LinearSearch(A, n, item);
    }
}
