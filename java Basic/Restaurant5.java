import java.util.*;


public class Restaurant5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Total Bill Amount: ");
        int bill = scan.nextInt();
           System.out.println("Enter a serive charge: ");
        int service = scan.nextInt();
           System.out.println("Enter a Gst: ");
        int gst = scan.nextInt();
           System.out.println("Enter a number of people: ");
        int people = scan.nextInt();


        int cal_service = bill * service/100;
        int cal_totservice = cal_service + bill;

        int cal_gst = cal_totservice*gst/100;
        int cal_totgst = cal_totservice+cal_gst;

        int cal_people = cal_totgst/people;

        System.out.println(cal_people);
    }
}
