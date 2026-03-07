import java.util.Scanner;

public class Array1D_5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        float [] arr = new float[n];
        float max = 1;
        float min = -1;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextFloat();
            if(arr[i] >= max|| max==1){
                max = arr[i];
            }
            if(arr[i] <= min||min==-1){
                min = arr[i];
            }
        }
        float difference  = max-min;
        float saving = (difference/max)*100;
        System.out.println("Number of Sellers: "+n);
        System.out.printf("Lowest Price: $%.2f\n",(double)min);
        System.out.printf("Highest Price: $%.2f\n",(double)max);
        System.out.printf("Price Difference: $%.2f\n",(double)difference);
        System.out.printf("Savings: %.2f %%",(double)saving);
        scan.close();
    }
}
