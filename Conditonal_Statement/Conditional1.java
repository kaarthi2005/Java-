import java.util.Scanner;

public class Conditonal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int performanceRating = scan.nextInt();
         int yearsOfService = scan.nextInt();

         System.out.print("Enter deparment press1 Critical or press0 Non-Critical : ");
        
          int departmentType = scan.nextInt();
           float baseSalary = scan.nextFloat();

         
       
       
       
        int bonus =0;
        int bool = 0;

        if(performanceRating >= 3){
            bool = 1;
            if(departmentType == 1){
                if(performanceRating == 5 && yearsOfService >5){
                    bonus = 25;
                }
                if(performanceRating ==4 && yearsOfService>10){
                    bonus = 22;
                }
                if(performanceRating == 4 && yearsOfService<5){
                    bonus = 15;
                }
                if(performanceRating == 3 && yearsOfService<5){
                    bonus = 10;
                }
            }else{
                 if(performanceRating == 5){
                    bonus = 18;
                 }
                 if(performanceRating == 4){
                    bonus = 12;
                 }
                 if(performanceRating == 3){
                    bonus = 8;
                 }
            }
        }


        float bounS_Cal = (baseSalary*bonus)/100.0f;
        System.out.println("Performance Rating: "+performanceRating);
        System.out.println("Years of Service: "+yearsOfService);
         if(departmentType == 1){
            System.out.println("Department: Critical");
        }else{
             System.out.println("Department: Non-Critical");
        }
        
        System.out.println("Bonus Percentage: "+bonus+" %");
        System.out.println("Bonus Amount: $"+bounS_Cal);
        if(bool == 1)
        System.out.println("Status: Eligible");
        else
        System.out.println("Status: Not Eligible");



        scan.close();
    }
}
