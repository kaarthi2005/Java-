import java.util.Scanner;

public class Array1D_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int total = 0;
        int max = 0;
        int peakDay = 1;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            total += arr[i];

            if(arr[i] > max){
                max = arr[i];
                peakDay = i + 1;
            }
        }
        int target = scan.nextInt();
        int belowTarget = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < target){
                belowTarget++;
            }
        }
        double avg = (double) total / n;
        double achievement = ((double)(n - belowTarget) / n) * 100;

        System.out.println("Days Tracked: " + n);
        System.out.println("Total Calories Burned: " + total);
        System.out.printf("Average Daily Burn: %.2f\n", avg);
        System.out.println("Peak Burn Day: Day " + peakDay + " (" + max + " calories)");
        System.out.println("Days Below Target: " + belowTarget);
        System.out.printf("Goal Achievement: %.2f%%\n", achievement);
        scan.close();
    }
}