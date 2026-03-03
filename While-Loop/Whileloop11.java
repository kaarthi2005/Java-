import java.util.Scanner;

public class Whileloop11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two number: ");
        int n1 = scan.nextInt();
        int og = n1;
        int n2 = scan.nextInt();
        int n = (n1<n2 ? n1 : n2);
        while (n!=0) {
            int temp = n;
            n = n1%n;
            n1= temp;
        }
        System.out.println("GCD of "+og+" and "+n2+" = "+n1);
        scan.close();
    }
}
