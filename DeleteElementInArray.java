import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, pos, i;
        int x[] = new int[100];

        System.out.print("\n Enter n: ");
        n = sc.nextInt();

        System.out.print("\n Enter Array Elements: ");
        for (i = 0; i < n; i++) {
            System.out.print("\n x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("\n Array is: ");
        for (i = 0; i < n; i++) {
            System.out.print("\n x[" + i + "] = " + x[i]);
        }

        System.out.print("\n Enter the Position to Delete: ");
        pos = sc.nextInt();

        for (i = pos; i < n - 1; i++) {
            x[i] = x[i + 1];
        }

        n = n - 1;

        System.out.print("\n Array after Deletion is: ");
        for (i = 0; i < n; i++) {
            System.out.print("\n x[" + i + "] = " + x[i]);
        }

        sc.close();
    }
}
