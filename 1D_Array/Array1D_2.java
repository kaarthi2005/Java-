import java.util.Scanner;

public class Array1D_2 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int [] arr = new int [n];
    int [] index = new int [n];
    int count = 0;
    int target = scan.nextInt();
    for(int i=0 ;i<n ;i++){
        arr[i] = scan.nextInt();
        if(arr[i] < target){
           
            index[count] = i;
            count++;
        }
    }

    System.out.println("Total Products: "+n);
    System.out.println("Minimum Threshold: "+target);
    System.out.println("Low Stock Products: "+count);
    for(int i=0 ;i<count ;i++){
        
        if(i==0 ){
            System.out.print("Product Indices: [ ");
        }
        System.out.print(index[i]);
        if(i==count-1){
           System.out.print(" ]");
        }
        else{
             
              System.out.print(", ");
        }
    }


    scan.close();

   }  
}
