import java.util.Scanner;

public class Whileloop14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int org = n;
        int count = 0;
        while (temp>0) {
            count++;
            temp/=10;
           
        }

        int sum = 0;
       
        while (n>0) {
            
           int mul = 1;
           int n1 = count;
           int digi = n%10;
           
           while (n1>0) {
            mul *= digi;
            n1--;
            }

            sum += mul;
            n/=10;

        }
        if(org == sum){
            System.out.println(org+" is an Armstrong number");
        }else {
             System.out.println(org+" is not an Armstrong number");
        }
        scan.close();
        
    }
}
