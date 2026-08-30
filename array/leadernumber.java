import java.util.*;
public class tofind_leadernumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(max);
        for(int i = arr.length-2 ;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
        scan.close();
    }
}
