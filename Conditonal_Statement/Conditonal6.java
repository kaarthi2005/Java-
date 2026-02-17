import java.util.Scanner;

public class Conditonal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bookingClass (Economy, Business, or First)");
        String bookingClass = scan.nextLine();
        int daysUntilDeparture = scan.nextInt();
        float seatAvailability = scan.nextFloat();
        System.out.println("routeType (Domestic , International-Short, or International-Long)");
        scan.nextLine();
        String routeType = scan.nextLine();
       
        String Demand = null;

        float price = 0;
        float Final_Price = 0.0f;


        if(bookingClass.equals("Economy")){
            if(routeType.equals("Domestic")){
              price = 200;
            }else if(routeType.equals("Int-Short")){
                price = 500;
            }else if(routeType.equals("Int-Long")){
                price =800;
            }
        }
        else if(bookingClass.equals("Business")){
             if(routeType.equals("Domestic")){
              price = 600;
            }else if(routeType.equals("Int-Short")){
                price = 1500;
            }else if(routeType.equals("Int-Long")){
                price =2500;
            }

        }
        else if(bookingClass.equals("First")){
             if(routeType.equals("Domestic")){
              price = 1000;
            }else if(routeType.equals("Int-Short")){
                price = 3000;
            }else if(routeType.equals("Int-Long")){
                price =5000;
            }
        }

        if(seatAvailability<30 && daysUntilDeparture <14){
            Demand ="High Demand";
            Final_Price = 1.8f;
        }else if(seatAvailability<50 && daysUntilDeparture <30){
            Demand ="High Demand";
            Final_Price = 1.5f;
        }else if((seatAvailability<60) || (daysUntilDeparture >30  && daysUntilDeparture <60 )){
            Demand ="Moderate";
            Final_Price = 1.0f;
        }else if(seatAvailability >=60 && daysUntilDeparture >60){
            Demand ="Low Demand";
            Final_Price = 0.8f;

        }

        float demand_multiplier = price*Final_Price;

        System.out.println("Booking Class: "+bookingClass);
        System.out.println("Days Until Departure: "+daysUntilDeparture);
        System.out.println("Seat Availability: "+seatAvailability+" %");
        System.out.println("Route Type: "+routeType);
        System.out.println("Base Price: $"+price);
        System.out.println("Demand Multiplier: "+Final_Price+"x");
        System.out.println("Final Ticket Price: $"+demand_multiplier);
        System.out.println("Pricing Category: "+Demand);
        scan.close();
    }
}
