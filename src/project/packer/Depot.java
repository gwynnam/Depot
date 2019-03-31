package project.packer;

/**
 *
 * @author Gwyn Nambatac
 */
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    /**
     * 
     * @return the name to string 
     */
    public String getName() {
        return name.toString();
    }
    
    /**
     * 
     * @return the coordinates 
     */
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    public String toString() {
        return this.getName();
    }
    
}
