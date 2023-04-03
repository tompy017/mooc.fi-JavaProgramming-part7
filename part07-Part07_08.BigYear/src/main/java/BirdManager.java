
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class BirdManager {
    
    private ArrayList<Bird> birds;
    
    public BirdManager() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        this.birds.add(newBird);
    }
 
    public void addObservation(Bird bird) {
        bird.increaseObservation();
    }
    
    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void printOnly(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)){
                System.out.println(bird);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public boolean birdExist(String birdName) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                return true;
            }
        }
        return false;
    }
     
    public Bird getBird(String birdName) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                return bird;
            }
        }
        return null;
    }

    public ArrayList<Bird> getBirdsList() {
        return birds;
    }
}

