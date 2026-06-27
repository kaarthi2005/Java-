import java.util.*;

public class Move_zero_to_end_without_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> list=Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
        scan.close();
    }
}
