import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Customer " + i + ": ");
            double amount = sc.nextDouble();

            double discount;

            if (amount >= 10000) {
                discount = amount * 0.20;
            } else if (amount >= 5000) {
                discount = amount * 0.10;
            } else if (amount >= 2000) {
                discount = amount * 0.05;
            } else {
                discount = 0;
            }

            double finalAmount = amount - discount;

            System.out.println("Customer " + i);
            System.out.println("Original: " + amount);
            System.out.println("Discount: " + discount);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println();
        }

        sc.close();
    }
}
