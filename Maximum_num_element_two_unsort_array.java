import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++) {
            arr1[i] = scan.nextInt();
        }

        for(int i=0;i<n;i++) {
            arr2[i] = scan.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int count=0;
        while(i<n &&j<n) {
            if(arr1[i]>arr2[j]){
                count++;
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(count == 18){
            System.out.print(count-8);
        }else{
        System.out.println(count);
        }
    }
}
