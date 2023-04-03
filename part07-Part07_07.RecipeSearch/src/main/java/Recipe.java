
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    

    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.getCookTime();
    }
    
    
    

    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}