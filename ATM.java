import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new Exception("Withdrawal amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance.");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: Rs. " + balance);
        }
        catch (Exception e) {
            System.out.println("Invalid withdrawal: " + e.getMessage());
        }

        sc.close();
    }
}