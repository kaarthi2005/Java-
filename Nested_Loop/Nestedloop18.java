import java.util.Scanner;

public class Nestedloop18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        String [] arr = new String[r];
        for(int i=0 ;i<r ;i++){
            switch (i) {
                case 0:
                    arr[i] = "Monday ";
                    break;
                case 1:
                    arr[i] = "Tuesday ";
                    break;
                case 2:
                    arr[i] = "Wednesday ";
                    break;
                case 3:
                    arr[i] = "Thrusday ";
                    break;
                case 4:
                    arr[i] = "Friday ";
                    break;
                case 5:
                    arr[i] = "Saturday ";
                    break;
            
                default:
                    break;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Day Period1 Period2 Period3 Period4");
        for(int i=0 ;i<r ;i++){
            System.out.print(arr[i]);
            for(int j=0 ;j<c ;j++){
                String str = scan.next();
                System.out.print(str+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        scan.close();
    }
}
