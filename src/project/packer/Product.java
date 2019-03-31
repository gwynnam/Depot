package project.packer;

/**
 *
 * @author Gwyn Nambatac
 */
public class Product {

    private String name;
    private int weight;
    private boolean hazardous;
    private boolean fragile;

    public Product(String name, int weight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hazardous item
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return the fragile item
     */
    public boolean isFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }
    
}
