
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author tom
 */
public class RecipeManager {
    private ArrayList<Recipe> recipes;
    
    
    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }
    
        
    public void readRecipes(String fileName) {

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                //loop through each line of the file
                String name = fileScanner.nextLine();
                int cookTime = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                // 3rd line and on before an empty line corresponds to ingredients
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
                //generate and add the new recipe to the manager list
                Recipe newRecipe = new Recipe(name, cookTime, ingredients);
                addRecipe(newRecipe);
            }
            
            
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> listRecipes() {
        return this.recipes;
    }
    
    public void listAll() {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findName(String name) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingMaxTime(int minutes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookTime() <= minutes) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
}
