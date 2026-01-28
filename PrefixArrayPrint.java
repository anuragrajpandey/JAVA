import java.util.Scanner;

public class PrefixArrayPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pf = new int[N];
        pf[0] = arr[0];

        for (int i = 1; i < N; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }

        System.out.println("Prefix sum array is:");
        for (int i = 0; i < N; i++) {
            System.out.print(pf[i] + " ");
        }

        sc.close();
    }
}
