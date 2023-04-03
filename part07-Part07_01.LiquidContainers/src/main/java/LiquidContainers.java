
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;
        String order = "";
        int amount = 0;
        int maxVolume = 100;


        while (true) {
            
            System.out.println("First: " + container1 + "/" + maxVolume);
            System.out.println("Second: " + container2 + "/" + maxVolume);
            
            
            String input = scan.nextLine();
            //QUIT ORDER
            if (input.equals("quit")) {
                break;
            }    
            System.out.println();
            
            // SPLIT INPUT INTO ORDERS AND AMOUNTS
            String[] inputOrder = input.split(" ");            
            if (inputOrder.length > 1) {
                order = inputOrder[0];
                amount = Integer.valueOf(inputOrder[1]);
            } else {
                order = inputOrder[0];
            }    
            //NOT ALLOWING NEGATIVES
            if (amount <= 0) {
                continue;
            }
            
                
            // ADD order    
            if (order.equals("add")) {
                if (container1 + amount <= maxVolume) {
                    container1 += amount;                
                } else {
                    container1 = maxVolume;
                }
            
            
            //MOVE ORDER
            } else if (order.equals("move")) {
                if (amount > container1) {
                    container2 += container1;
                    container1 = 0;
                } else {
                    container1 -= amount;
                    container2 += amount;
                }
                
            } else if (order.equals("remove")) {
                if (container2 - amount >= 0) {
                    container2 -= amount;
                }
            }
            //
            if (container2 > maxVolume) {
                container2 = maxVolume;
            }

        }
    }

}
