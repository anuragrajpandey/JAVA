// Given an array element check if there exists a pair (i,j) such that a[i] + a[j] == k and i =! j
// NOTE: i and j are index value and k is the given sum

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int k = 9;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("Pair found at indices " + i + " and " + j);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}