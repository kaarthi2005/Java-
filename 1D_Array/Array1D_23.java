import java.util.Scanner;

public class Array1D_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int total = 0;
        int max = 0;
        int maxIndex = 1;

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            total += arr[i];
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i + 1;
            }
        }
        double avg = (double) total / n;
        double threshold = avg * 0.9;
        int under = 0;
        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " + total + " units");
        System.out.printf("Average Output: %.2f units/hour\n", avg);
        System.out.println("Top Producer: Line " + maxIndex + " (" + max + " units)");
        System.out.print("Priority Lines: [");
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
        System.out.println("Underperforming Lines: " + under);
        System.out.printf("Performance Threshold: %.2f units\n", threshold);

        scan.close();
    }
}