import java.util.Scanner;

public class Nestedloop16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int occupiedSpots = scan.nextInt();
        boolean [][]arr = new boolean [occupiedSpots][occupiedSpots];
       
        for(int i=0 ;i<occupiedSpots ;i++){ 
                int n1 = scan.nextInt();
                int n2 = scan.nextInt();
                arr[n1][n2] = true;
        }
        
        for(int i=0 ;i<r ;i++){
            for(int j =0;j<c ;j++){
                if(arr[i][j] == true){
                    System.out.print("[O] ");
                }else{
                     System.out.print("[] ");
                }
            }
            System.out.println();
        }

        int spot = r*c;
        float occupancy = ((float)occupiedSpots/spot)*100.f;

        System.out.println("Total Spots: "+spot);
        System.out.println("Occupied: "+occupiedSpots);
        System.out.println("Vacent: "+(r*c-occupiedSpots));
        System.out.printf("Occupancy Rate: %.2f %%",occupancy);
    scan.close();
    }
}
