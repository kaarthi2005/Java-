import java.util.Scanner;

public class Conditonal18 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        float packageWeight = scan.nextFloat();
        scan.nextLine();
        String destinationZone = scan.nextLine();
        String shippingSpeed  = scan.nextLine();
        String packageSize  = scan.nextLine();

        float  baserate = 0;
        if(shippingSpeed.equals("Economy")){
            baserate = 5;
        }else  if(shippingSpeed.equals("Standard")){
            baserate = 10;
        }else  if(shippingSpeed.equals("Express")){
            baserate = 25;
        }else if(shippingSpeed.equals("Overnight")){
            baserate = 50;
        }

        float weightsurcharge = (packageWeight<15.0 ? packageWeight : packageWeight+packageWeight);

        float  zonemultiplier = 0;
        if(destinationZone.equals("Local")){
          zonemultiplier = 1.0f;
        }else  if(destinationZone.equals("Regional")){
           zonemultiplier = 1.2f;
        }else  if(destinationZone.equals("National")){
           zonemultiplier = 1.5f;
        }else if(destinationZone.equals("International")){
          zonemultiplier = 3.0f;
        }

        float sizesurcharge = 0;
        if(packageSize.equals("Small")){
            sizesurcharge = 0;
        }else  if(packageSize.equals("Medium")){
            sizesurcharge = 5;
        }else  if(packageSize.equals("Large")){
            sizesurcharge = 15;
        }else if(packageSize.equals("Oversized")){
            sizesurcharge = 30;
        }


        float baseCost = (baserate*weightsurcharge)*zonemultiplier;
        float totalCost = baseCost+sizesurcharge;

        System.out.println("Package Weight: "+packageWeight);
        System.out.println("Destination Zone: "+destinationZone);
        System.out.println("Shipping Speed: "+shippingSpeed);
        System.out.println("Package Size: "+packageSize);
        System.out.println("Base Shipping Rate: $"+baserate);
        System.out.println("Weight Surcharge: $"+weightsurcharge);
        System.out.println("Zone Multiplier: "+zonemultiplier);
        System.out.println("Size Surcharge: $"+sizesurcharge);
        System.out.println("Total Shipping Cost: $"+totalCost);
       



        }
    }

