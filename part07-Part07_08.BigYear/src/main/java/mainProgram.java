
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdManager manager = new BirdManager();
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equalsIgnoreCase("Quit")) {
                break;            
            // add a new bird
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                manager.addBird(name, latinName);            
            // print all birds
            } else if (command.equalsIgnoreCase("All")) {
                manager.printAll();            
            // print 1 bird
            } else if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                manager.printOnly(birdName);
            // add observation
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                if (manager.birdExist(birdName)) {
                    Bird observedBird = manager.getBird(birdName);
                    observedBird.increaseObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            // other command
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
