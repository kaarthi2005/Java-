import java.util.Scanner;

public class Array1D_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];
        int count = 0 ;
        float sum =0 ;
        float max = 1;
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextInt();
            if(arr[i] >60){
                count++;
            }
            if(arr[i] >= max || max == 1){
                max = arr[i];
            }
            sum+= arr[i];
        }

        Double level = ((double)(n-count)/n)*100 ;
        System.out.println("Total Patients: "+n);
        System.out.printf("Longest Wait Time: %.2f min\n",max);
        System.out.printf("Average Wait Time: %.2f min\n",sum/n);
        System.out.println("Patients Waiting >60 min: "+count);
        System.out.printf("Service Level: %.2f%%\n",(double)level);
        scan.close();
    }
}
