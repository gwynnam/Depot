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
import project.packer.Product;
import static org.junit.Assert.*;
import project.packer.Address;
import project.packer.Coordinates;
import project.packer.Customer;
import project.packer.Depot;
import project.packer.Manifest;
import project.packer.Box;

/**
 *
 * @author Gwyn Nambatac
 */
public class BoxTest {
    
    // Test data
    Coordinates testCoordinates0 = new Coordinates(0,0);
    Coordinates testCoordinates1 = new Coordinates(3,4);
    Coordinates testCoordinates2 = new Coordinates(30,40);
    Coordinates testCoordinates3 = new Coordinates(300, 400);
    Coordinates testCoordinates4 = new Coordinates(3000, 4000);
    
    Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
    Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
    Address testAddress2 = new Address("123 Count St", "Brooklyn", "Welling Town", "B222", testCoordinates2);
    Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
    Address testAddress4 = new Address("55 Some St", "Somewhere", "Elsewhere", "E555", testCoordinates4);
    
    Depot testDepot0 = new Depot("Test Depot", testAddress0);
    Depot testDepot4 = new Depot("Test Depot", testAddress4);
    
    Manifest manifest1 = new Manifest();

    //manifest1.addProduct(new Product("Hammer", 3, false, false), 1);
    
    Product a1 = new Product("Alpha", 0, true, true);
    Product a2 = new Product("Alpha", 2, true, true);
    Product a3 = new Product("Alpha", 3, false, true);
    Product a4 = new Product("Alpha", 4, true, false);
    
    Product b1 = new Product("Beta", 0, true, true);
    Product b2 = new Product("Beta", 2, true, true);
    Product b3 = new Product("Beta", 3, false, true);
    Product b4 = new Product("Beta", 4, true, false);
    
    public BoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Address class...");
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
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_1args_1() {
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_ErrorType_int() {
    }

    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        testBox.addProduct(new Product("Hammer", 3, false, false), 1);
        
        String expectedLabel = "Test Customer\n321 Back StChristlyHolly OaksC333\nHammer x 1\n";
        assertEquals(expectedLabel, testBox.getLabel());
        
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        testBox.addProduct(new Product("Hammer", 3, false, false), 1);
        String s = testBox.getLabel();
        
        String expectedLabel = "Test Customer\n321 Back StChristlyHolly OaksC333\nHammer x 1\n";
        assertEquals(expectedLabel, testBox.toString());
    }

    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        testBox.addProduct(new Product("Hammer", 3, false, false), 1);
        String s = testBox.getLabel();
        
        assertEquals(3.0, testBox.getWeight(), 0.0005);
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_1args_2() {
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_ErrorType() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        Product prod1 = new Product("Hammer", 3, false, false);
        testBox.addProduct(prod1, 1);
        String s = testBox.getLabel();
        
        assertEquals(true, testBox.canFit(prod1));
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_ErrorType_int() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        Product prod1 = new Product("Hammer", 3, false, false);
        testBox.addProduct(prod1, 1);
        String s = testBox.getLabel();
        
        assertEquals(true, testBox.canFit(prod1, 1));
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        Product prod1 = new Product("Hammer", 3, false, false);
        testBox.addProduct(prod1, 1);
        String s = testBox.getLabel();
        
        assertEquals(37.0, testBox.remainingCapacity(), 0);
    }
    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        Product prod1 = new Product("Hammer", 3, false, false);
        testBox.addProduct(prod1, 1);
        String s = testBox.getLabel();
        
        assertEquals(false, testBox.isFragile());
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
                Customer testCustomer = new Customer("Test Customer", testAddress3);
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Depot testDepot = new Depot("Test Depot", testAddress3);
        Box testBox = new Box(testCustomer, testDepot);
        Product prod1 = new Product("Hammer", 3, false, false);
        testBox.addProduct(prod1, 1);
        String s = testBox.getLabel();
        
        assertEquals(false, testBox.isHazardous());
    }
    
}
