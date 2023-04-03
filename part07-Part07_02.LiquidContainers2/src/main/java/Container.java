
/**
 *
 * @author tom
 */
public class Container {
    private int contains;
    private int maxVolume;
    
    
    public Container() {
        this.contains = 0;
        this.maxVolume = 100;
    }
    
    
    public int contains() {
        return this.contains;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.contains += amount;
            
            if (this.contains > this.maxVolume) {
                this.contains = this.maxVolume;
            }
        }
    }
    
    public void remove(int amount) {

        this.contains -= amount;
        
        if (this.contains < 0) {
            this.contains = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.contains + "/" + this.maxVolume;
    }
    
}
