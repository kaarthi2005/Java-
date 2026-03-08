import java.util.Scanner;

public class Array1D_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int max = 0, min = 100;
        int maxIndex = 1;
        int minIndex = 1;
        int risk = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i + 1;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i + 1;
            }
            if(arr[i] < 60){
                risk++;
            }
        }

        double avg = (double) sum / n;
        double successRate = ((double)(n - risk) / n) * 100;
        System.out.println("Total Students: " + n);
        System.out.printf("Average Completion: %.2f%%\n", avg);
        System.out.println("Highest Completion: " + max + "% (Student " + maxIndex + ")");
        System.out.println("Lowest Completion: " + min + "% (Student " + minIndex + ")");
        System.out.println("At-Risk Students (<60%): " + risk);
        System.out.printf("Success Rate: %.2f%%\n", successRate);

        scan.close();
    }
}