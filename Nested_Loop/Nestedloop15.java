import java.util.Scanner;

public class Nestedloop15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float avg = 0;
        for(int i=0 ;i<n ;i++){
            String str = scan.next();
            float star = scan.nextFloat();
            int count = 1;
            avg+=star;
            System.out.print(str);
            System.out.print(" "+star+" ");
            for(int j=0 ;j<5;j++){
                if(count <= (int)star){
                    System.out.print(" * ");
                }else{
                    System.out.print(" - ");
                }
                count++;
            }
            System.out.println();
        }
        System.out.println("Average Rating: "+(avg/n));
        scan.close();

    }
}
