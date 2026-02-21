import java.util.*;

public class Forloop1 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =0;
        Double totalPayroll =0.00d;
        for(int i=0 ;i<n ;i++){
            scan.nextLine();
            String employeeName = scan.nextLine();
            Double baseSalary = scan.nextDouble();
            int performanceRating = scan.nextInt();

            int incrementpercentage = 0;
            if(performanceRating==5){
                incrementpercentage = 15;
            }else if(performanceRating==4){
                incrementpercentage = 10;
            }else if(performanceRating==3){
                incrementpercentage = 5;
            }else if(performanceRating==2){
                incrementpercentage = 2;
            }else if(performanceRating==1){
                incrementpercentage = 0;
            }

            Double  finalsalary = baseSalary *(1+incrementpercentage/100.0f);

            System.out.println("Employee: "+employeeName);
            System.out.printf("Base Salary: $%.1f",baseSalary);
            System.out.println("Performance Rating: "+performanceRating);
            System.out.println("Increment: "+incrementpercentage+"%");
            System.out.printf("Final Salary: $%.1f\n",finalsalary);
            System.out.println();
            System.out.println();
           
            totalPayroll += finalsalary;
            count++;

        }

        System.out.println("Total Employees Processed: "+count);
        System.out.printf("Total Payroll: $%.1f\n",totalPayroll);
        System.out.printf("Average Salary: $%.1f\n",totalPayroll/count);






        scan.close();
    }
}