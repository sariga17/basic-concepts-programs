import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current, withdrawal, balance;

        System.out.println("Current balance:");
        current = scanner.nextInt();

        System.out.println("Withdrawal amount:");
        withdrawal = scanner.nextInt();

        if (withdrawal > current) {
            System.out.println("Insufficient funds!");
        } else {
            balance = current - withdrawal;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }

        scanner.close(); 
    }
}

