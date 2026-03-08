import java.util.Scanner;

public class Array1D_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        double max = 0, min = 100;
        int maxIndex = 1, minIndex = 1;

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextDouble();
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i + 1;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i + 1;
            }
        }
        double avg = sum / n;
        double threshold = avg * 0.8;
        
        System.out.println("Fleet Size: " + n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n", avg);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n", max, maxIndex);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n", min, minIndex);
        System.out.print("Maintenance Priority: [");
        int under = 0;
        boolean first = true;
        for(int i = 0; i < n; i++){
            if(arr[i] < threshold){
                under++;
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                first = false;
            }
        }
        System.out.println("]");
        System.out.println("Underperforming Vehicles: " + under);
        System.out.printf("Efficiency Threshold: %.2f MPG\n", threshold);
        scan.close();
    }
}