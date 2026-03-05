import java.util.Scanner;

public class Nestedloop14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int seat = scan.nextInt();

        int count = 1;
        int scount = 0;
        int seats = r*c; 
        for(int i=1 ;i<=r*2 ;i++){
             scount ++;
            for(int j=1 ;j<=c ;j++){
               if(count != seat+1 ){
                if(i%2==0 ){
                    if(j%2==0){
                    System.out.printf(" S%03d ",count);
                    count++;
                    }else{
                     System.out.print(" ---- ");
                    }

                }else if(i%2!=0){
                    if(j%2==0 ){
                        System.out.print(" ---- ");
                    
                    }else  {
                     
                      System.out.printf(" S%03d ",count);
                      count++;
                    }
                }

            }else{
                System.out.print(" ---- ");
            }
               

            }
            if(scount == seats){
                    break;
                }
            System.out.println();
        }
        System.out.println("Total Seats: "+seats);
        System.out.println("Occupied Seats: "+(seat));
        System.out.println("Empty Seats: "+(seats-seat));
        scan.close();
    }
}
