import java.util.*;
public class Whileloop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum =0,count=0 ;

        while(n != 0){
            System.err.println("Enter number (0 to stop): "+n);
            sum += n;
            count++;
            n = scan.nextInt();
        }
        System.err.println("Total sum: "+sum);
        System.out.println("Count: "+count);
        scan.close();
    }
}
