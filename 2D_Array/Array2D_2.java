import java.util.Scanner;

public class Array2D_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int n = scan.nextInt();

        boolean [][] arr = new boolean[n][n];
        int  a ;
        int  b ; 
        for(int i=0;i<n;i++){
            a  = scan.nextInt();
            b  = scan.nextInt();
            for(int j=0 ;j<1;j++){
                arr[a][b]= true;
            }
        }
        int book = 0;
        int total = 0;
        int available_Seat = 0;
        System.out.println("Seating Chart: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                total++;
                if(arr[i][j] == true){
                    System.out.print("B ");
                    book++;
                }else{
                    available_Seat++;
                    System.out.print("A ");
                }
            }
            System.out.println();
        }

        Double avg = ((double)book/total)*100;
        System.out.println();
        System.out.println("Total Seats: "+total);
        System.out.println("Booked Seats: "+book);
        System.out.println("Available Seats: "+available_Seat);
        System.out.printf("Occupancy Rate: %d %%",avg);

        scan.close();
        

    }
}
