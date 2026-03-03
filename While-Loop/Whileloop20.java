import java.util.Scanner;

public class Whileloop20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int og = n;
       
        int sum = 0;
        while (n>0) {
             int muul =1;
            int rem = n%10;
            while (rem>0) {
                muul *= rem;
                rem--;
            }
            sum += muul;
            n/=10;
        }
        if(sum == og ){
            System.err.println(og+" is a strong number");
        }else{
             System.err.println(og+" is not a strong number");
        }
        scan.close();
    }
}
