import java.util.Scanner;

public class Array1D_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float [] arr = new float[n];


        float max = 1;
        float min = -1;
        float sum = 0 ;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextFloat();
            if(arr[i] >= max||max ==1){
                max = arr[i];
            }
            if(arr[i] <= min || min == -1){
                min = arr[i];
            }
            sum+= arr[i];
        }
        System.out.println("Number of Readings: "+n);
        System.out.printf("Maximum Temperature: %.2f'C\n",max);
         System.out.printf("Minimum Temperature: %.2f'C\n",min);
        System.out.printf("Temperature Range: %.2f'C\n",min-max);
         System.out.printf("Average Temperature:  %.2f'C\n\n",sum/n);
        scan.close();
    }
}
