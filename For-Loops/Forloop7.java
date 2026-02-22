import java.util.Scanner;

public class Forloop7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        float totalunit = 0;
        float totalrev = 0;
      
        for(int i=0 ;i<N ;i++){
            count++;
            scan.nextLine();
            String consumerID = scan.nextLine();
            float unitsConsumed = scan.nextFloat();


            float billAmount = 0;
            String category = null;
            if(unitsConsumed >= 0  && unitsConsumed <=100){
                billAmount = 0.10f;
                category = "Low Usage";
            }else if(unitsConsumed >= 101  && unitsConsumed <= 200){
                 billAmount = 0.13f;
                 category = "Low Usage";
            }else if(unitsConsumed >= 201  && unitsConsumed <= 300){
                 billAmount = 0.16f;
                 category = "Medium Usage";
            }else if(unitsConsumed >300){
                 billAmount = 0.20f;
                 category = "High Usage";
            }

            float avgbillamount = (unitsConsumed * billAmount);

            System.out.println("Consumer ID: "+consumerID);
            System.out.println("Units Consumed: "+(int)unitsConsumed);
            System.out.println("Bill Amount: $"+avgbillamount);
            System.out.println("Category: "+category);
            System.out.println();
            System.out.println();

            totalunit += unitsConsumed;
            totalrev += avgbillamount;






        }
        System.out.println("Total Consumers: "+count);
        System.out.println("Total Units Consumed: "+(int)totalunit);
        System.out.println("Total Revenue: $"+totalrev);
        System.out.println("Average Bill: $"+totalrev/count);
        System.out.println();


        scan.close();
    }
}
