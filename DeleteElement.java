import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n, pos;

        // Input size
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Position to delete
        System.out.print("Enter position to delete: ");
        pos = sc.nextInt();

        if(pos < 1 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to left
            for(int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            n--; // reduce size

            // Print updated array
            System.out.println("Array after deletion:");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}