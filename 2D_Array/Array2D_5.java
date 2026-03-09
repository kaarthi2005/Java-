import java.util.Scanner;

public class Array2D_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int [][] arr = new int [r][c];
        int min = -1;
        int mr = -1;
        int mc = -1;
        int MR = -1;
        int MC =-1;
        int max = 1;
        int sum = 0;
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
              arr[i][j] = scan.nextInt();
              sum += arr[i][j];
              if(max<= arr[i][j] || max ==1){
                max = arr[i][j];
                MR = i;
                MC = j;
              }
              if(min >= arr[i][j]|| min ==-1){
                min = arr[i][j];
                mr = i;
                mc = j;
              }
            }
        }
        int count = 0;
        System.out.println();
        System.out.println("Temperature Grid: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(sum);
        Double avg = ((double)sum/count);
        System.out.println();
        System.out.println("Maximum Temperature: "+max+"'C at position ("+MR+", "+MC+")");
        System.out.println("Minimum Temperature: "+min+"'C at positon ("+mr+", "+mc+")");
        System.out.printf("Average Temperature: %.2f'C",(double)avg);
        scan.close();
    }
}
