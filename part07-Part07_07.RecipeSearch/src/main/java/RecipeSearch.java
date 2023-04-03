
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeManager = new RecipeManager();
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        RecipeSearch.menu();
        recipeManager.readRecipes(fileName);
        
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeManager.listAll();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchFor = scanner.nextLine();
                System.out.println();
                recipeManager.findName(searchFor);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int minutes = Integer.valueOf(scanner.nextLine());
                recipeManager.findCookingMaxTime(minutes);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeManager.findIngredient(ingredient);
            } else {
                System.out.println(command + " unknown command.");
                RecipeSearch.menu();
            }        
        }
    }
    
    public static void menu() {
        System.out.println("\nCommands:");
        System.out.println("list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
    }
}