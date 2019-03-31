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
import project.packer.Coordinates;
import project.packer.Depot;
import project.packer.Manifest;
import project.packer.Product;

/**
 *
 * @author Gwyn Nambatac
 */
public class ManifestTest { 
    
    public ManifestTest() {
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
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product() {
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    @Test
    public void testAddProduct_Product_int() {
    }

    /**
     * Test of removeProduct method, of class Manifest.
     */
    @Test
    public void testRemoveProduct() {
    }

    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    @Test
    public void testGetTotalWeight() {
        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        
        assertEquals(53.0, manifest.getTotalWeight() ,0);
    }

    /**
     * Test of getHeaviestUnder method, of class Manifest.
     */
    @Test
    public void testGetHeaviestUnder() {
        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        
        assertEquals(new Product("Saw", 5, false, false), manifest.getHeaviestUnder(5.0));
    }

    /**
     * Test of isEmpty method, of class Manifest.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    @Test
    public void testContainsProduct() {
    }

    /**
     * Test of toString method, of class Manifest.
     */
    @Test
    public void testToString() {
        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        
        assertEquals("Nails x 12\nHammer x 1\nLadder x 2\nSaw x 1", manifest.toString());
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, true), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        
        assertEquals(true, manifest.hasFragileItems());
    }

    /**
     * Test of getWeight method, of class Manifest.
     */
    @Test
    public void testGetWeight() {
    }
    
}
