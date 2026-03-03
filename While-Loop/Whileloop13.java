import java.util.Scanner;

public class Whileloop13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int n1 = scan.nextInt();
        int og = n1;
        int sum = 1;
        while (n1>0) {
            sum = sum*n;
            n1--;
        }
        System.out.println(n+"^"+og+" = "+sum);
        scan.close();
    }
}
