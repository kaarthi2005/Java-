import java.util.Scanner;

public class Whileloop9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        int og = n;
        while (n>0) {
           int rem =  n%10;
            sum+= rem;
            n/=10;
        }
        System.out.println("Number: "+og);
        System.out.println("Sum of digits: "+sum);


        scan.close();
    }
}
