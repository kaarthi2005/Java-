import java.util.*;
public class Move_All_zeros_to_End_of_Array{
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int [n];

    for(int i=0 ;i<n ;i++){
        arr[i] = scan.nextInt();
    }

    String zero = "";
    List<Integer> list = new ArrayList<>();

    for(int val : arr){
        if(val == 0){
            zero += String.valueOf(val);
        }else{
            list.add(val);
        }
    }

    for(int i=0 ;i<zero.length();i++){
        list.add(Integer.parseInt(zero.split("")[i]));
    }
    list.toArray();
    System.out.println(list);

 }
}