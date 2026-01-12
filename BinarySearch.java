public class BinarySearch {
    public static void BinarySearch(int A[], int n, int item) {
        int beg = 0;
        int end = n - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (item == A[mid]) {
                System.out.format("Item %d found at position %d\n", item, mid);
                return;
            }
            if (item < A[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        System.out.format("Item %d not found\n", item);
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 55, 77, 89, 90};
        int n = A.length;
        int item = 55;
        BinarySearch(A, n, item);
    }
}