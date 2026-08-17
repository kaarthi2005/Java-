import java.util.*;

public class Main{
    public static long tomul(long n){
        long num = 1;
        while(n>0){
            long rem = n%10;
            num *=rem;
            n/=10;
        }
        return num;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int count = 0;
        while(num>=10){
            count++;
            num = tomul(num);
        }
        System.out.print(count+" "+num);
    }
}
