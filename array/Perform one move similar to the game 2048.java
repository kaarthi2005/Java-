import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        String direction = scan.next();
        List<Integer> list = new ArrayList<>();
        
        for(int x : arr){
            if(x!=0){
                list.add(x);
            }
        }
        
        List <Integer> result = new ArrayList<>();
        int i =0;
        if(direction.equals("LEFT")){
            while(i<list.size()){
                if(i+1 <list.size() && list.get(i).equals(list.get(i+1))){
                    result.add(list.get(i)*2);
                    i +=2;
                }
                else{
                    result.add(list.get(i));
                    i++;
                }
            }        
            for(int j=0;j<n;j++){
                if(j<result.size()){
                    System.out.print(result.get(j)+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
        }
        else{
            i = list.size()-1;
            while(i>=0){
                if(i-1>=0 && list.get(i).equals(list.get(i-1))){
                    result.add(list.get(i)*2);
                    i -=2;
                }
                else{
                    result.add(list.get(i));
                    i--;
                }
            }
            Collections.reverse(result);
            int val = n-result.size();
            for(int j=0;j<val;j++){
                System.out.print(0+" ");
            }
            for(int j=0;j<result.size();j++){
                System.out.print(result.get(j)+" ");
            }
        }

    }
}
