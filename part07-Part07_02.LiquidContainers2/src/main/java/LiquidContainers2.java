
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        String order;
        int amount = 0;


        while (true) {
            System.out.println();
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            
            
            // SPLIT INPUT INTO ORDERS AND AMOUNTS
            String[] inputOrder = input.split(" ");            
            if (inputOrder.length > 1) {
                order = inputOrder[0];
                amount = Integer.valueOf(inputOrder[1]);
            } else {
                order = inputOrder[0];
            }    
            
            if (order.equals("add")) {
                container1.add(amount);
            }
            
            if (order.equals("move")) {
                if (amount <= container1.contains()) {
                    
                    container1.remove(amount);
                    container2.add(amount);
                } else {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
                }
            }    
            
            if (order.equals("remove")) {
                container2.remove(amount);
            }

        }

    }

}
