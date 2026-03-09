import java.util.Scanner;

public class Array2D_9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        long [][] arr= new long[r][c];
        long min = -1;
        long max = 1;

        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                arr[i][j] = scan.nextLong();
                if(max <= arr[i][j] || max == 1){
                    max = arr[i][j];
                }
                if(min >= arr[i][j] || min ==-1){
                    min = arr[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Elevation Map: ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Highest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        if((max-min) == 0){
             System.out.println("Elevation Range: "+"00"+" m");
        }else{
        System.out.println("Elevation Range: "+(max-min)+" m");
        }
        scan.close();
        
    }
}