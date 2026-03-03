import java.util.*;
public class Whileloop25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int count = 0;
        do{
            System.out.print(i+" ");
            count++;

            if (i==count) {
                System.out.println();
                count = 0;
                i++;
            }
        }while(i<=n);
        scan.close();
    }
}
