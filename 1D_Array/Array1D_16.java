import java.util.Scanner;

public class Array1D_16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        long total = 0;
        long peak = 0;
        int peakDay = 1;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextLong();
            total += arr[i];

            if(arr[i] > peak){
                peak = arr[i];
                peakDay = i + 1;
            }
        }
        long avg = total / n;
        double threshold = avg * 1.5;
        int count = 0;
        System.out.println("Trading Days Analyzed: " + n);
        System.out.println("Total Volume: " + total);
        System.out.println("Average Daily Volume: " + avg);
        System.out.println("Peak Volume Day: Day " + peakDay + " (" + peak + ")");
        System.out.print("Breakout Signal Days: [");
        for(int i = 0; i < n; i++){
            if(arr[i] > threshold){
                count++;
                System.out.print((i + 1));
                if(i < n-1) System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("High Volume Days (>150% avg): " + count);
        scan.close();
    }
}