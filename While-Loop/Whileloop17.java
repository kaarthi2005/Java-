import java.util.Scanner;

public class Whileloop17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int sum = 0; 
        boolean flag = true;
        while (flag) {
            if(n%i==0){
                sum += i;
            }
            i++;
            if(i == n){
                flag = false;
            }
            
        }
        if(sum == n){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
        scan.close();
    }
}
