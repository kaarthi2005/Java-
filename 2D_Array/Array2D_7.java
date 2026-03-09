import java.util.Scanner;

public class Array2D_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [][] arr = new int[r][c];

        int sum =0 ;
        int max = 1;
        int row = -1;
        int col = -1;
        int count = 0;
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                count++;
                arr[i][j] = scan.nextInt();
                sum+= arr[i][j];
                if(max <= arr[i][j] || max ==1){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println();
        System.out.println("Inventory Grid: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Double avg = ((double)sum/count);
        System.out.println();
        System.out.println("Total Inventory: "+sum);
        System.out.println("Max Stock Zone: Row "+row+" , "+"Col "+col+"("+max+" units)");
        System.out.printf("Average Stock per Zone: %.2f\n",avg);

        scan.close();
    }
}
