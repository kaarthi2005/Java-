import java.util.Scanner;

public class Array1D_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Double [] arr = new Double[n];
        Double max = 1.00;
        Double min = -1.00;
        Double sum = 0.00;
        int store1 = 0;
        int store2 = 0;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextDouble();
            if(max <= arr[i] || max == 1.00){
                max = arr[i];
                store1 = i+1;
            }
            if(min >= arr[i] || min == -1.00){
                min = arr[i];
                store2 = i+1;
            }
            sum += arr[i];
        }

        System.out.println("Total Stores: "+n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n",max,store1);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n",min,store2);
        System.out.printf("Total Sales: $%.2f\n",sum);
        System.out.printf("Average Sales: $%.2f",sum/n);
        scan.close();
    }
}
