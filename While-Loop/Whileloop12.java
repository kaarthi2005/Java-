import java.math.BigInteger;
import java.util.Scanner;

public class Whileloop12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger number = scan.nextBigInteger();
        BigInteger og = number;
        BigInteger rev = BigInteger.ZERO;
        while (number.compareTo(BigInteger.ZERO)>0) {
            BigInteger digit = number.mod(BigInteger.TEN);
            rev = rev.multiply(BigInteger.TEN).add(digit);
            number = number.divide(BigInteger.TEN);
        }
        if(og.equals(rev)){
            System.out.println(og+" is a palidrome");
        }else {
            System.out.println(og+" is not a palidrome");
        }
        scan.close();
    }
}
