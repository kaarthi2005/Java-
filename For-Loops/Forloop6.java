import java.util.Scanner;

public class Forloop6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double initialBalance = scan.nextDouble();
        Double temp = initialBalance;
        int N = scan.nextInt();
        int count  =0 ;
        int fail = 0;
        int pass = 0;
        
       

        for(int i=0 ;i<N ;i++){
            count++;
             Double withdrawalAmount = scan.nextDouble();
             int flag = 0;
             String status = "Denied";
             if(withdrawalAmount<= initialBalance){
                status = "Approved";
             }

             if(status.equals("Approved")){
                flag = 1;
                pass++;
             }
             else if(status.equals("Denied")){
                flag = 0;
                fail++;
             }

             System.out.printf("Transaction %d: $%.1f\n",count,withdrawalAmount);
             System.out.println("Status: "+status);
             if(flag==1){
                initialBalance = initialBalance-withdrawalAmount;
                System.out.printf("Remaining Balance: $%.1f\n",initialBalance);
             }else{
                System.out.println("Reason: Insufficient funds");
                System.out.printf("Remaining Balance: $%.1f\n",initialBalance);
             }
             System.out.println();
             System.out.println();

             


        }
        System.out.println("Total Transactions: "+count);
        System.out.println("Successful Withdrawals: "+pass);
        System.out.println("Failed Withdrawals: "+fail);
        System.out.printf("Final Balance: $%.1f\n",initialBalance);
        System.out.printf("Total Withdrawn: $%.1f\n",temp-initialBalance);
        System.out.println();

        scan.close();
    }
}
