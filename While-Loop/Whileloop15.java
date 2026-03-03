import java.util.Scanner;

public class Whileloop15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        boolean flag = true;
        do{
            if(n==1){
                flag = false;
            }
            count++;
            if(count == 1){
            System.out.println("Collatz sequence starting from "+n+":");
            }
            System.out.print(n+" ");
            if(n%2==0){
                n = n/2;
            }else {
                n = 3*n+1;
            }
            
        }
        while(flag);
        System.out.println("\nSteps: "+(count-1));
        scan.close();
    }
}
