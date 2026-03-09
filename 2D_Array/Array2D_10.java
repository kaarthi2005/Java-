import java.util.Scanner;

public class Array2D_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [] rowsum = new int [r];
        int [] colsum = new int [c];
        int [][] arr = new int [r][c];
        for(int i=0 ;i<r ;i++){
            int sum =0 ;
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
                sum += arr[i][j];
            }
            rowsum[i] = sum;
        }

        for(int i=0 ;i<c ;i++){
            int sum =0 ;
            for(int j=0 ;j<r ;j++){
                sum+= arr[j][i];
            }
            colsum[i] = sum;
        }

        System.out.println();
        System.out.println("Sales Matrix: ");
        for(int i=0 ;i< r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Representative Totals:");

        for(int i=0 ;i<r;i++){
            System.out.println("Rep: "+(i+1)+" : "+rowsum[i]);
        }
        System.out.println();
        System.out.println("Territory Totals: ");
        for(int i=0 ;i<c;i++){
            System.out.println("Territory "+(i+1)+" : "+colsum[i]);
        }

        scan.close();
    }
}
