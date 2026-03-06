import java.util.Scanner;

public class Array1D_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];

        int max = arr[0];
        int min  = -1;
       
        int fail = 0;
        int pass = 0;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i] < min || min == -1){
                min = arr[i];
            }
            if(arr[i]<40){
                fail++;
            }else{
                pass++;
               
            }
        }

        Double percentage = ((double)pass/n)*100;

        System.out.println("Total Students: "+n);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);
        System.out.println("Failed Students: "+fail);
        System.out.printf("Pass Percentage: %.2f %%",percentage);
        scan.close();
    }
}
