import java.util.*;

public class Nestedloop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        

        

        for(int i=1 ;i<=r;i++){
            if(i==1){
                System.out.println();
                System.out.println("Grade Sheet:\r\n" + "Student Sub1 Sub2 Sub3 Average\r");
            }
            int total = 0;
            scan.nextLine();
            String student  = scan.next();
              System.out.print(student+" ");
            for(int j = 1 ;j<=c ;j++){

                int num = scan.nextInt();
                total += num;
                System.out.print(num+" ");
            }
          
            System.out.printf("%.2f\n",(float)total/c);
           

        }
        scan.close();
    }
}
