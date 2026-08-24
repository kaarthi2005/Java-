import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Queue <Integer> val = new LinkedList<>();
        for(int i=0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                val.offer(i);
            }
            else if(ch == ')'){
                val.poll();
            }
        }
        boolean bool [] = new boolean [s.length()];
        for(int i=0;i<val.size();i++){
                bool[val.peek()] = true;
                val.poll();
        }
        for(int i=0;i<s.length();i++){
            if(!bool[i]){
                System.out.print(s.charAt(i));
            }
        }
    }
}
