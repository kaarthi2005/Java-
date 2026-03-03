import java.util.*;
public class Whileloop6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        boolean flag = true;
        do{
            System.out.println("Balance: "+balance);
            System.out.print("Enter withdrawal amount: ");
            int withdrawal = scan.nextInt();
            if(withdrawal > balance){
                System.out.println("Insufficient funds! Try again.");
            }else if(withdrawal <=100){
                System.out.println("Invalid amount! Try again.");
            }else if(withdrawal <balance){
                System.out.println("Withdrawal successful! Remaining balance: "+(balance-withdrawal));
            }
        }
        while(flag);
        scan.close();
    }
}
