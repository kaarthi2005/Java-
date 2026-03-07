import java.util.Scanner;

public class Array1D_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int thresold = scan.nextInt();
        int count = 0;
        int [] arr = new int [n];
        int []arr2 = new int [n];
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>thresold){
                arr2[count] = i+1; 
                count++;
            }
        }
        System.out.println("Production Lines: "+n);
        System.out.println("Acceptable Threshold: "+thresold);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: [");
        for(int i=0 ;i<count;i++){
            System.out.print(arr2[i]);
            if(i != count-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        Double compliance = ((double)(n-count)/n )*100;
        System.out.printf("Compliance Rate: %.2f %%",(double)compliance);
        scan.close();
    }
}
