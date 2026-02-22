import java.util.*;
public class Forloop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float totalsales = 0;
        float totalcomm = 0;
        String max = null;
        int count =0;
        Double high = Double.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            count++;
            scan.nextLine();
            String salesRep = scan.nextLine();
            Double salesAmount = scan.nextDouble();

            int commissionrate = 0;
            if(salesAmount >=0 && salesAmount <=40000){
                commissionrate = 5;
            }else  if(salesAmount >=40001 && salesAmount <=80000){
                 commissionrate = 8;
            }else  if(salesAmount >=80001 && salesAmount <=100000){
                 commissionrate = 10;
            }else  if(salesAmount >=100001 && salesAmount <=150000){
                 commissionrate = 12;
            }else {
                 commissionrate = 15;
            }

            Double commissionearned  = (salesAmount*commissionrate)/100;

          float bonus = 0;
            if(salesAmount >= 100000 && salesAmount <= 149999){
                bonus = 2000;
            }else if(salesAmount >=150000 ){
                bonus = 3000;
            }
            Double totalpayout = commissionearned+bonus;

            totalsales += salesAmount;
            totalcomm += commissionearned;
            if(totalpayout>high){
                high = totalpayout;
                max = salesRep;
            }

            System.out.println();
            System.out.println("Sales Rep: "+salesRep);
            System.out.printf("Sales Amount: $%.1f\n",salesAmount);
            System.out.println("Commission Rate: "+commissionrate+"%");
            System.out.printf("Commission Earned: $%.1f\n",commissionearned);
            System.out.println("Bonus: $"+bonus);
            System.out.printf("Total Payout: $%.1f\n",totalpayout);
            System.out.println();
            System.out.println();


        }
        System.out.println("Total Sales Reps: "+count);
        System.out.println("Total Sales: $"+totalsales);
        System.out.println("Total Commissions: $"+totalcomm);
        System.out.println("Top Performer: "+max);

        scan.close();
    }
}
