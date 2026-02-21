import java.util.*;

public class Forloop3 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lowcount =0;
        int cricount = 0;
        int total = 0;
        int count =0 ;
        Double totalPayroll =0.00d;
        for(int i=0 ;i<n ;i++){
            count++;
            scan.nextLine();
            String product = scan.nextLine();
            int currentStock = scan.nextInt();
            int minimumStock = scan.nextInt();

            String Status = null;
            if(currentStock >= minimumStock){
                Status = "Adequate";
            }else if((currentStock < minimumStock) && (currentStock >= minimumStock/2)){
                Status = "Low Stock";
                lowcount++;
            }else if(currentStock < minimumStock/2){
                Status = "Critical";
                cricount++;
            }
            float reorder = 0;
            if(Status.equals("Adequate")){
                reorder = 0;
            }else if(Status.equals("Low Stock")){
                reorder = (minimumStock-currentStock)+(minimumStock/2);
            }else if(Status.equals("Critical")){
                reorder = (minimumStock - currentStock)+(minimumStock*1.5f);
                
            }

        
            System.out.println("Product: "+product);
            System.out.println("Current Stock: "+currentStock);
            System.out.println("Minimum Stock: "+minimumStock);
            System.out.println("Status: "+Status);
            System.out.println("Reorder Quantity: "+(int)reorder);
            System.out.println();
            System.out.println();



            total +=reorder; 

        }


        System.out.println("Total Products: "+count);
        System.out.println("Low Stock Items: "+lowcount);
        System.out.println("Critical Items: "+cricount);
        System.out.println("Total Reorder Quantity: "+total);






        scan.close();
    }
}