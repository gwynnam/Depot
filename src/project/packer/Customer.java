package project.packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gwyn Nambatac
 */
public class Customer {
    
    private String name;
    private List<Address> addresses;

    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    public String getName() {
        return name;
    }

    /**
     * 
     * @param d
     * @return the closest address 
     */
    public Address getClosestAddressTo(Depot d) {
        double bestDistance = Double.MAX_VALUE;
        Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistance) {
                bestAddress = a;
            }
        }
        return bestAddress;
    }

    /**
     * 
     * @return the name 
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
