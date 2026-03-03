import java.util.Scanner;

public class Whileloop7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2=0;
        boolean flag = true;
        do{
            System.out.printf("1. Add\r\n" + "2. Subtract\r\n" + "3. Multiply\r\n" + "4. Divide\r\n" + "5. Exit\r\n" );
            int menu = scan.nextInt();
            if(menu != 5){
                System.out.println("Enter a number 1 : ");
                 n1 = scan.nextInt();
                System.out.println("Enter a number 2 : ");
                 n2 = scan.nextInt();
            }
            int sum = 0;
            switch (menu) {
                case 1:
                    sum = n1+n2;
                    break;
                case 2:
                    sum = n1-n2;
                    break;
                case 3:
                    sum = n1*n2;
                    break;
                case 4:
                    sum = n1/n2;
                    break;
                case 5:
                    flag = false;
                    break;
            }
            System.out.println("Result: "+sum);
            System.out.println();
            if(menu != 5){
            System.out.println("Press 5 for exit");
            }
            System.out.println();
            System.out.println();
        }
        while(flag);
        scan.close();
    }

}
