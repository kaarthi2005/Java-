import java.util.*;

public class Whileloop26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int rem = 0;
        int num = 0;
        while (n>0){
            count++;
            if(n%2==0){
                num = 0;
            }else{
                num = 1;
            }

            rem = (rem*10)+num;
            n = n/2;
        }  
        int count1 = 0;
        int n1 = rem;
        while (n1>0) {
            count1++;
            n1/=10;
        }
        int total = count-count1;
        int a = 0 ;
        if(count!=count1){
            String ch = "0";
          String str = Integer.toString(rem);
          while (total != 0) {
            str += ch;
            total--;
          }
          StringBuilder sb = new StringBuilder(str);
          sb.reverse();
         
           a= Integer.parseInt(sb.toString());
        int sum = 0;
        int num2 = 1;
        while (a>0) {
            int rem2 = a%10;
            if(rem2 == 1){
                sum += num2;
            }
            num2 = num2 * 2;
            a/=10;
        }
        System.out.println(sum);
        scan.close();
    }
}
}