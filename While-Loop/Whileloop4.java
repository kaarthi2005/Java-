import java.util.Scanner;

public class Whileloop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int org = n;
        int fact = 1;
        while (n>0){
           fact *= n;
           n--;
        }
        System.out.printf("Factorial of %d = %d",org,fact);
        scan.close();
    }
  
}
