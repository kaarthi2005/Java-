import java.util.Scanner;

public class Whileloop10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0 ;
        int b = 1;
        int n = scan.nextInt();
        System.out.println("Fibonacci sequence ("+n+" terms):");
        while(n>0){
            System.out.print(a+" ");
            int sum = a+b;
            a = b;
            b = sum;
            n--;
        }
        scan.close();
    }
}
