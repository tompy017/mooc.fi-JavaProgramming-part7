
/**
 *
 * @author tom
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observations;
    
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }
    
    public void increaseObservation() {
        this.observations ++;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getLatinName() 
                + "): " + this.getObservations() + " observations";     
    }

    
}
