/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project.packer.Address;
import project.packer.Box;
import project.packer.Coordinates;
import project.packer.Customer;
import project.packer.Depot;
import project.packer.Manifest;
import project.packer.Product;
import project.packer.Packer;

/**
 *
 * @author Gwyn Nambatac
 */
public class PackerTest {
    
    public PackerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        
        assertEquals("", Packer.packProducts(testCustomer, testDepot, manifest));

    }
    
}
