import java.util.Scanner;

public class Array2D_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int [][] arr = new int [r][c];
        
        for(int i=0 ;i< r;i++){
            for(int j=0 ;j< c;j++){
                arr[i][j]  =  scan.nextInt();
            }
        }
        int [] product = new int [r];
        int index = -1;
        int sum ;
        int max = Integer.MIN_VALUE;
        for(int i=0 ;i< r;i++){
            sum = 0;
            for(int j=0 ;j< c;j++){
                sum += arr[i][j];
            }
            product[i] = sum;
            if(max <product[i]){
                max = product[i];
                index = i+1;
            }
        }

        System.out.println();
        System.out.println("Sales Data: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0 ;i<r ;i++){
            System.out.println("Product "+(i+1)+" :"+product[i]);
        }
        System.out.println();
        System.out.println("Best-Selling Product: Product "+index+" with "+max+" units");
        System.out.println();

        scan.close();
    }
}
