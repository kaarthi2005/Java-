import java.util.Scanner;

public class Whileloop8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 1;
        int count = 0;
        boolean flag = true;
        while (flag) {
            if(n%a == 0){
                count++;
            }
            if(a==n){
                flag = false;
            }
            a++;
        }
        if(count == 2){
            System.out.println(n+" is Prime");
        }else {
            System.out.println(n+" is not Prime");
        }

        scan.close();
    }
}
