import java.util.Scanner;

public class Whileloop22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;
        
        while (i!=n+1) {
            if(i%2==0){
                sum+=i;
            }i++;
        }
        System.out.println(sum);
        scan.close();
    }
}
