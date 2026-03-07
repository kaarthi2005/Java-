import java.util.Scanner;

public class Array1D_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];
        int max = 1;
        int min = -1;
        int sum = 0;
        int count = 0;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextInt();
            if(max <= arr[i]|| max ==1){
                max = arr[i];
            }
            if(min >= arr[i] || min == -1){
                min = arr[i];
            }

            if(arr[i]>200){
                count++;
            }
            sum+= arr[i];
        }
        
        Double avg = ((double)sum/n);
        Double score = (((double)n-count)/n)*100;
        System.out.println("Total Servers: "+n);
        System.out.println("Fastest Response: "+min+"ms");
        System.out.println("Slowest Response: "+max +"ms");
        System.out.printf("Average Response: %.2fms\n",avg);
        System.out.println("Slow Servers (>200ms): "+count);
        System.out.printf("Performance Score: %.2f%%\n",score);

        scan.close();
    }
}
