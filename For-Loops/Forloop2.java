import java.util.*;

public class Forloop2 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =0;
        int sum =0 ;
        int max = 0;
        int pass = 0;
        int fail = 0;
        
        for(int i=0 ;i<n ;i++){
            scan.nextLine();
            String studentName  = scan.nextLine();
            int score  = scan.nextInt();
           

            char grade ='a';
            if(score >= 85 && score <=100){
                grade = 'A';
            }else if(score >= 70 && score <=84){
                grade = 'B';
            }else if(score >= 60 && score <= 69){
                grade = 'C';
            }else if(score >= 50 && score <= 59){
                grade = 'D';
            }else if(score >= 0 && score <= 49){
                grade = 'F';
            }
            

            String status = null;
            if(score<60){
                status ="Fail";
                fail++;
            }else if(score>=60){
                status ="Pass";
                pass++;
            }

            sum += score;
            count++;
           
            System.out.println("Student: "+studentName);
            System.out.println("Score: "+score);
            System.out.println("Letter Grade: "+grade);
            System.out.println("Status: "+status);
            System.out.println();
            System.out.println();

           
           
          
        }
        System.out.println("Total Students: "+count);
        System.out.println("Class Average: "+(float)sum/count);
        System.out.println("Highest Score: "+max);
        System.out.println("Students Passed: "+pass);
        System.out.println("Students Failed: "+fail);


        scan.close();
    }
}