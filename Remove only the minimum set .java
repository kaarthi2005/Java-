import java.util.*;

public class Main{
     public static void main(String [] args){
          Scanner scan = new Scanner(System.in);
          String s = scan.next();
          Queue <Integer> bracket  = new LinkedList<>();
          boolean remove [] = new boolean[s.length()];
          int i=0;
          while(i<s.length()){
               char ch = s.charAt(i);
               if(ch == '('){
                    bracket.add(i);
               }else if(ch == ')'){
                    if(!bracket.isEmpty()){
                    bracket.poll();
                    }
                    else {
                         remove[i] = true;
                    }
               }
               i++;
          }
          while(!bracket.isEmpty()){
               int index = bracket.poll();
               remove[index] = true;
          }
          
          StringBuilder str = new StringBuilder();
          for(int j=0;j<s.length();j++){
               if(!remove[j]){
                    str.append(s.charAt(j));
               }
          }
          
          System.out.print(str);
     }
}
