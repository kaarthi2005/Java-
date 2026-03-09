import java.util.Scanner;

public class Array2D_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int add = scan.nextInt();
        int [][]arr = new int [r][c];

        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original Image: ");
        for(int i=0 ;i<r;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Ajusted Image: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                int x = arr[i][j] + add;
                if(x>=255){
                    System.out.print("255 ");
                }else{
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        scan.close();
    }
}
