import java.util.*;
public class Nestedloop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
         int r = scan.nextInt();
        int c = scan.nextInt();
        for(int i=1 ;i<=r ;i++){
            System.out.print("Row "+i+":");
            for(int j=1 ;j<=c ;j++){
                count++;
                System.out.print(" Seat-"+j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Seats: "+count);

        scan.close();
    }
}
