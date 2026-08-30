import java.util.*;

public class Pattern1{
     static Scanner scan = new Scanner (System.in); 
     public static void main(String[] args) {
       
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
        Pattern6();
        Pattern7();
        Pattern8();
        Pattern9();
        Pattern10();
        Pattern11();
        Pattern12();
        Pattern13();
        Pattern14();
        Pattern15();
        Pattern16();
        Pattern17();
        Pattern18();
        Pattern19();
        Pattern20();
        Pattern21();
        Pattern22();
       scan.close();
    }
    public static void Pattern1(){
        int n = scan.nextInt();
        for(int i =0 ;i< n ;i ++){
            for(int j=0 ;j<n ;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void Pattern2(){
        int n = scan.nextInt();
        for(int i = 0; i< n ;i++){
            for(int j = 1; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(){
        int n = scan.nextInt();
        for(int i = 1;i<= n ;i++){
            for(int j = 1;j< i+1;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }


    public static void Pattern4(){
        int n = scan.nextInt();
        for(int i = 1 ;i <= n;i++){
            for(int j = 1 ;j< i+1 ;j++){
                System.out.print(i+" ");
            }System.out.println();
        }
    }
    public static void Pattern5(){
        int n = scan.nextInt();
        for(int i = 1 ;i <= n ;i++){
            for(int j = n ;j >= i ;j--){
                System.out.print("* ");
            }System.out.println();
        }
    }

     public static void Pattern6(){
        int n = scan.nextInt();
       
        for(int i = 1 ;i <= n ;i++){
            int k = 1;
            for(int j = n ;j >= i ;j--){
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
    }

    public static void Pattern7(){
        int n = scan.nextInt();
        int space = n;
        int star = 1;
        for(int i=1 ; i<= n ;i++){
            // for initialize space x 
            for(int j= space ;j >0 ;j--){
                System.out.print(" ");
            }
            // for initialize star x
            for(int k = 1 ;k <= star  ;k++){
                System.out.print("*");
            }System.out.println();
            space--;
            star +=2;
        }
    }


    public static void Pattern8(){
        int n = scan.nextInt();
        int star = (n*2)-1;
        int space = 0;
        for(int i =1 ;i<= n;i++){
            for(int k=space ;k >0 ;k--){
                System.out.print(" ");
            }
            for(int j= star ;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            star -=2;
            
            space++;
        }
    }

    public static void Pattern9(){
        int n = scan.nextInt();
        int space = n/2;
        int star = 1;

        for(int i= 1 ;i<=n ;i++){
            if(i <= n / 2 ){
                for(int j = space;j>0;j--){
                    System.out.print(" ");
                }for(int k = star;k>0;k--){
                    System.out.print("*");
                }System.out.println();
                space--;
                star +=2;
            }else{
                for(int l = space;l>0;l--){
                    System.out.print(" ");
                }for(int m = star;m>0;m--){
                    System.out.print("*");
                }System.out.println();
                space++;
                star-=2;
            }
        }
    }


    public static void Pattern10(){
        int n = scan.nextInt();
        int star = 1;
        for(int i=1;i<= n ;i++){
            for(int j =star ;j>0;j--){
                System.out.print("*");
            }System.out.println();
            if(i <= n/2 ){
                star++;
            }else{
                star--;
            }
        }
    }

    public static void Pattern11(){
        int n = scan.nextInt();
        for(int i=1 ;i<= n;i++){
            for(int j=1 ;j<=i;j++){
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print(1+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }else if(i%2==0){
                   if(j%2 !=0){
                    System.out.print(0+" ");
                   }else{
                    System.out.print(1+" ");
                   }
                }

               
            }
             System.out.println();
        }
    }

    public static void Pattern12(){
        int n = scan.nextInt();
        int space =(n*2) -2;
        for(int i=1 ;i<=n ;i++){
            for(int j =1;j<= i;j++){
                System.out.print(j);
            }
            for(int k=space;k>0;k--){
                System.out.print(" ");
            }
            for(int l=i;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
            space-=2;
        }
    }

    public static void Pattern13(){
        int n = scan.nextInt();
        int k =1;
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }System.out.println();
        }
    }

    public static void Pattern14(){
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.printf("%c ",65+j);
            }System.out.println();
        }
    }

    public static void Pattern15(){
        int n= scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.printf("%c ",65+j);
            }System.out.println();
        }
    }

    public static void Pattern16(){
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j>0;j--){
                System.out.printf("%c ",i+65);
            }System.out.println();
        }
    }

    public static void Pattern17(){
        int n = scan.nextInt();
        int space = n;
        for(int i = 0;i<=n ;i++){
            for(int k=space ;k>0;k--){
                System.out.print("  ");
            }
            for(int j= 0;j<i;j++){
                System.out.printf("%c ",j+65);
            }

            for(int m =i-2;m>=0;m--){
                System.out.printf("%c ",m+65);
            }
            System.out.println();
            space--;
        }
    }


    public static void Pattern18(){
        int n = scan.nextInt();
        
        for(int i = 0;i<n;i++){
            int k = 65+n-1-i;
          for(int j = 0;j<= i;j++ ){
            System.out.printf("%c",k+j);
          }System.out.println();
        }
    }


    public static void Pattern19(){
        int n = scan.nextInt();
        int space = 0;
        int star = n/2;
        for(int i=1;i <= n;i++){
                for(int j = 0; j < star; j++){
                    System.out.print("*");
                }
                for(int k = 0; k < space; k++){
                    System.out.print(" ");
                }
                for(int l = 0; l < star; l++){
                    System.out.print("*");
                }
                if(i < n/2){
                    space +=2;
                    star--;
                }else if(i == n/2){
                  
                }else{
                    space -=2;
                    star++;
                }
                 System.out.println();
      }
    }


    public static void Pattern20(){
        int n  = scan.nextInt();
        int star = 1;
        int space = n-1;
        for(int row = 1;row <= n;row++){
            for(int i=0;i<star;i++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<star;k++){
                System.out.print("*");
            }

            if(row < n/2+1){
                star++;
                space-=2;
            }else{
                star--;
                space+=2;
            }
            System.out.println();
        }
    }


    public static void Pattern21(){
        int n = scan.nextInt();
        int star = n/2;
        int space =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int k = 0;k<space;k++){
                System.out.print(" ");
            }
            for(int l=0 ;l<star;l++){
                System.out.print("*");
            }

            if(i ==0 ){
                space =2;
                star--;
            }
            if(i == n-2){
                space =0;
                star++;
            }
            System.out.println();
        }
    }

    public static void Pattern22(){
        int n = scan.nextInt();
        int row = (n*2) -1;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                int top = i;
                int left = j;
                int right = (row-1)-j;
                int bottom = (row-1)-i;
                int max = top;
                if(left < max){
                    max = left;
                }
                if(right <max){
                    max = right;
                }
                if(bottom <max){
                    max = bottom;
                }
                System.out.print(n -max+" ");
            }
            System.out.println();
        }
        scan.close();
    }

    

}