import java.util.Scanner;

public class Forloop20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalTransfers = 0;
        double totalPayments = 0;
        int count = 0; 
        for (int i = 0; i < n; i++) {
            String transactionType = scan.next();
            double amount = scan.nextDouble();
            String category = null;
            if (transactionType.equals("Deposit")) {
                category = "Credit";
                totalDeposits += amount;
            } else {
                category = "Debit";
                if (transactionType.equals("Withdrawal")) {
                    totalWithdrawals += amount;
                } else if (transactionType.equals("Transfer")) {
                    totalTransfers += amount;
                } else if (transactionType.equals("Payment")) {
                    totalPayments += amount;
                }
            }
            count++; 
            System.out.println();
            System.out.println("Transaction " + count + ": " + transactionType);
            System.out.println("Amount: $" + amount);
            System.out.println("Category: " + category);
            System.out.println();
        }


        double netBalance = totalDeposits -
                (totalWithdrawals + totalTransfers + totalPayments);

 
        System.out.println("Total Transactions: " + count);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Withdrawals: $" + totalWithdrawals);
        System.out.println("Total Transfers: $" + totalTransfers);
        System.out.println("Total Payments: $" + totalPayments);
        System.out.println("Net Balance Change: $" + netBalance);

        scan.close();
    }
}