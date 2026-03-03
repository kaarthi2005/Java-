import java.util.Scanner;

public class Whileloop21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        boolean flag = true;
        int i=0;
        do{
            i++;
            System.out.println(n+" x "+i+" = "+(n*i));
            if(i==10){
                flag = false;
            }

        }while(flag);
        scan.close();
    }
}
