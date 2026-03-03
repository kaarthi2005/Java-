import java.util.Scanner;

public class Whileloop24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i =0;
        while (a != b) {
            if(a>b){
                a = a-b;
                i = 1;
            }else{
                b = b-a;
                i = 2;
            }
            
        }
        if(i==1){
            System.out.println(a);
        }else if(i == 2){
            System.out.println(b);
        }
        scan.close();
    }
}
