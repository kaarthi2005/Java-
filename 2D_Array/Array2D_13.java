import java.util.Scanner;

public class Array2D_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int arr[][] = new int [r][c];
        int count = 0;
        int empty1 = 0;
        for(int i=0 ;i<r ;i++){
           int sum =0 ;
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
               sum+=arr[i][j];
                if(arr[i][j]>0){
                    count++;
                }
                
            }
            if(sum == 0){
               empty1++;
            }
            
        }
        int [] empty = new int [empty1];
        int k =0;
        System.out.println();
        System.out.println("Seating Map: ");
        for(int i=0 ;i<r ;i++){
             int sum =0 ;
            for(int j=0 ;j<c ;j++){
                 sum+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            if(sum == 0){
                empty[k] = i;
                k++;
            }
            System.out.println();
        }
        int total = r*c;
        double avg = ((double)count/total )*100;
        System.out.println();
        System.out.println();
        System.out.println("Total Occupied: "+count);
        System.out.printf("Occupancy Rate: %.2f%%\n",avg);
        System.out.print("Empty Rows: [");
        boolean flag = true;
        for(int i=0 ;i<empty1 ;i++){
            if(!flag){
                System.out.print(", ");
            }
            System.out.print(empty[i]);
            flag = false;
        }
        System.out.print("]");
        scan.close();
        
    }
}