import java.math.BigInteger;
import java.util.Scanner;

public class Whileloop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger  n = scan.nextBigInteger();
        BigInteger rev = BigInteger.ZERO;
        System.out.println("Original: "+n);
        while(n.compareTo(BigInteger.ZERO)>0){
            BigInteger digi = n.mod(BigInteger.TEN);
            rev = rev.multiply(BigInteger.TEN).add(digi);
            n = n.divide(BigInteger.TEN);
        }
        System.out.println("Reversed: "+rev);
        scan.close();
    }
}
