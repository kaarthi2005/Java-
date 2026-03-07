import java.util.Scanner;

public class Array1D_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float [] arr = new float [n];
        float sum = 0;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextFloat();
            sum += arr[i];
        }
        float avg = sum/n;
        int suspicius = 0;
       int [] fraud = new int [n];
        for(int i =0 ;i<n ;i++){
            if(avg<arr[i]){
                fraud[suspicius]= i;
                suspicius++;
            }
        }

        System.out.println("Total Transactions: "+n);
        System.out.printf("Average Transaction: $%.2f\n",avg);
        System.out.printf("Suspicious Transactions: %d \n",suspicius);
        for(int i=0 ;i<suspicius;i++){
            if(i==0){
                System.out.print("Fraud Alert Indices: [");
            }
                System.out.print(fraud[i]);
            if(i!=suspicius-1){
                System.out.print(", ");
            }
            if(i== suspicius-1){
                System.out.print("]");
            }
        }
        

        scan.close();
    }
}
