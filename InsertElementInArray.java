import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {

        // Declare variables
        int n, item, pos, i;
        Scanner sc = new Scanner(System.in);

        // Read n
        System.out.print("\nEnter n: ");
        n = sc.nextInt();

        // Declare array (size n+1 for insertion)
        int x[] = new int[n + 1];

        // Read array
        System.out.println("\nEnter Array Elements:");
        for (i = 0; i < n; i++) {
            System.out.print("Enter x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        // Print array
        System.out.println("\nArray is:");
        for (i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        // Read item
        System.out.print("\nEnter Item: ");
        item = sc.nextInt();

        // Read position
        System.out.print("Enter Position: ");
        pos = sc.nextInt();

        // Shift elements down
        for (i = n; i > pos; i--) {
            x[i] = x[i - 1];
        }

        // Insert element
        x[pos] = item;

        // Increase size
        n++;

        // Reprint array
        System.out.println("\nArray after insertion:");
        for (i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        sc.close();
    }
}
