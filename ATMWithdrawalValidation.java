public class ATMWithdrawalValidation {
    public static void main(String[] args) {

        int[] withdrawals = {500, 2000, 15000, 8000, 25000, 1000};
        int maxWithdrawal = 20000;

        for (int amount : withdrawals) {

            if (amount <= 0) {
                System.out.println(amount + " Invalid amount");
            } 
            else if (amount % 100 != 0) {
                System.out.println(amount + " Amount must be a multiple of 100");
            } 
            else if (amount > maxWithdrawal) {
                System.out.println(amount + " Maximum withdrawal limit exceeded");
            } 
            else {
                System.out.println(amount + " Transaction Successful");
            }
        }
    }
}