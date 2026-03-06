import java.util.*;

public class Array1D_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Double [] arr = new Double[n];
        Double sum = 0.00;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextDouble();
            sum  += arr[i];
        }
        int avg_count =0;
        Double avg = sum/n;
        for(int i=0 ;i<n ;i++){
            if(avg<= arr[i]){
                avg_count++;
            }
        }

        Double perct = ((double)avg_count/n)*100;
        System.out.println("Total Employees: "+n);
        System.out.printf("Average Salary: %.2f\n",avg);
        System.out.println("Employees Above Average: "+avg_count);
        System.out.printf("Percentage: %.2f%%\n",perct);

        scan.close();
    }
}
