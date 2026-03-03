import java.util.Scanner;

public class Whileloop16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int og = n;
        int sum = 0;
        int num = 1;
        while (n>0) {
            int rem = n%10;
            if(rem == 1){
                sum += num;
            }
            num = num*2;
            n/=10;
        }
        System.out.println("Binary: "+og);
        System.out.println("Decimal: "+sum);
        scan.close();
    }
}
