import java.util.Scanner;

public class probelm10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a total number of dilivery: ");
        int delivery = scan.nextInt();
        System.out.println("Enter a payload: ");

        int payout = scan.nextInt();
        System.out.println("Enter a incentive: ");

        int incentive = scan.nextInt();
        System.out.println("Enter a feulcost: ");

        int feulcost = scan.nextInt();
       

       

        int total = (delivery * payout) +incentive- feulcost;

        System.err.println(total);
    }
}


