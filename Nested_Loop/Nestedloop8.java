import java.util.*;
public class Nestedloop8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
       int full = 0;

        System.out.println("Attendance Matrix:\r\n"+"Student Day1 Day2 Day3 Day4 Day5 Day6 Day7 Attendance%\r\n");
        for(int i=0 ;i<a ;i++){
             int count =0;
            String str = scan.next();
            System.out.print(str);
            for(int j=0 ;j<b ;j++){
                String attance = scan.next();
                if(attance.equals("P")){
                    count++;
                }
                System.out.print(" "+attance);
            }
            int avg = (count* 100)/b;
            if(avg == 100){
                full++;
            }
            System.out.print("  "+(float)avg+"%\n\n");
        }
        System.out.println("Perfect Attendance: "+full+" students");
        System.out.println();
    }
}