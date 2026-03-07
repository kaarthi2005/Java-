import java.util.Scanner;

public class Array1D_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Double [] arr = new Double[n];
        Double [] arr1 = new Double[n];

        for(int i=0 ;i<n ;i++){
            arr [i] = scan.nextDouble();
        }
        for(int i=0 ;i<n ;i++){
            arr1[i] = scan.nextDouble();
        }

        Double min = -1.0;
        Double max = 1.0;
        Double []total = new Double[n]; 
        Double sum =0.0 ;
        int asses1 = 0;
        int asses2 = 0;

        for(int i=0 ;i<n ;i++){
            total[i] = (arr[i]*arr1[i]);
            if(total[i] <= min || min == -1.0){
                min = total[i];
                asses2 = i+1;
            }
            if(total[i] >= max || max == 1.0){
                max = total[i];
                asses1 = i+1;
            }
            sum += total[i];
        }


        System.out.println("Number of Assets: "+n);
        System.out.printf("Total Portfolio Value: $%.2f\n",sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n",asses2,max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n",asses1,min);
 
        scan.close();
        
        
        
        
        
        
        
        
    }
}
