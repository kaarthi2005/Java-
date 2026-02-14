import java.util.*;


public class Operator2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt(); 
       int b = scan.nextInt(); 
       int c = scan.nextInt(); 

       if(a >= b && c>=b){
           System.out.println("Approved");
       }
       else{
          System.out.println("Declined");
       }
    }
}
