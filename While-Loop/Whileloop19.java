import java.util.Scanner;

public class Whileloop19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 0;
        int rem = 0;
        int count = 0;
        while (n>0) {
            count++;
            if(n%2==0){
                num = 0;
            }else{
                num = 1;
            }

            rem = (rem*10)+num;
            n = n/2;

        }
        int n1 = rem;
        int count1 = 0;
        while (n1>0) {
            count1++;
            n1/=10;
        }
        int total = count - count1;
        if(count == count1){
            System.out.println("Binary: "+rem);
        }else{
            System.out.print("Binary: "+rem);
            while (total!=0) {
                System.out.print(0);
                total--;
            }
        }

        scan.close();
    }
}
