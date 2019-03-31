package project.packer;

/**
 *
 * @author Kezia Nambatac
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;

    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }

    public String getAddress() {
    return street + suburb + city + postcode;
}
    /**
     * 
     * @return the address 
     */
    public String toString() {
        return this.getAddress();
    }
    /**
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
