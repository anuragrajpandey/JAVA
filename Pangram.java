import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        boolean pangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (str.indexOf(ch) == -1) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is not a Pangram.");
        }

        sc.close();
    }
}