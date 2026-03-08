import java.util.Scanner;

public class Array1D_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int total = 0;
        int max = 0;
        int bestProduct = 1;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            total += arr[i];

            if(arr[i] > max){
                max = arr[i];
                bestProduct = i + 1;
            }
        }
        double avg = (double) total / n;
        double threshold = avg * 0.5;
        int slow = 0;
        System.out.println("Total Products: " + n);
        System.out.println("Total Units Sold: " + total);
        System.out.printf("Average Monthly Sales: %.2f\n", avg);
        System.out.println("Best Seller: Product " + bestProduct + " (" + max + " units)");
        System.out.print("Clearance Candidates: [");
        boolean first = true;
        for(int i = 0; i < n; i++){
            if(arr[i] < threshold){
                slow++;
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(i + 1);
                first = false;
            }
        }
        System.out.println("]");
        System.out.println("Slow-Moving Products: " + slow);
        System.out.printf("Turnover Threshold: %.2f units\n", threshold);

        scan.close();
    }
}
