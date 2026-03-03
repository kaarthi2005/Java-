import java.util.Scanner;

public class Whileloop18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int a = n1;
        int n2 = scan.nextInt();
        int b = n2;
        int n = (n1<n2 ?n1:n2);
        int n3 = (n1>n2 ?n1:n2);
        while (n!=0) {
            int temp = n;
            n = n3 % n;
            n3 = temp;
        }
        System.out.println((a*b)/n3);
        scan.close();
    }
}
