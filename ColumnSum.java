import java.util.Scanner;

class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nColumn Sum:");
        for (j = 0; j < cols; j++) {
            int sum = 0;
            for (i = 0; i < rows; i++) {
                sum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}
