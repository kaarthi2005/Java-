import java.util.Scanner;

public class Array1D_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        double max = 0, min = 100;
        int maxIndex = 1;
        int minIndex = 1;
        
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
        double threshold = avg * 2.0;
        System.out.println("Total Posts: " + n);
        System.out.printf("Average Engagement: %.2f%%\n", avg);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n", max, maxIndex);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n", min, minIndex);
        System.out.print("Top Performers: [");
        boolean first = true;
        int viral = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > threshold){
                viral++;
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                first = false;
            }
        }
        System.out.println("]");
        System.out.println("Viral Posts (>200% avg): " + viral);
        System.out.printf("Viral Threshold: %.2f%%\n", threshold);

        scan.close();
    }
}
