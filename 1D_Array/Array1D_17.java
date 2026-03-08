import java.util.Scanner;

public class Array1D_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        double min = 14.0;
        double max = 0.0;
        int unsafe = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextDouble();
            sum += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        double avg = sum / n;
        System.out.println("Total Samples: " + n);
        System.out.printf("Average pH: %.2f\n", avg);
        System.out.printf("Minimum pH: %.2f\n", min);
        System.out.printf("Maximum pH: %.2f\n", max);
        System.out.print("Critical Alerts: [");
        boolean first = true;
        for(int i = 0; i < n; i++){
            if(arr[i] < 6.5 || arr[i] > 8.5){
                unsafe++;
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                first = false;
            }
        }
        System.out.println("]");
        double compliance = ((double)(n - unsafe) / n) * 100;
        System.out.println("Unsafe Samples: " + unsafe);
        System.out.printf("Safety Compliance: %.2f%%\n", compliance);

        scan.close();
    }
}
