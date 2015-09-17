

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine vendingMachine = new VendingMachine(50);
        vendingMachine.fillUp(10);
        assertEquals(60, vendingMachine.getCanCount());
        vendingMachine.fillUp(5);
        assertEquals(65, vendingMachine.getCanCount());
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine vendingMachine = new VendingMachine(50);
        vendingMachine.insertToken();
        assertEquals(1, vendingMachine.getTokenCount());
        vendingMachine.insertToken();
        assertEquals(2, vendingMachine.getTokenCount());
    }
    
    @Test
    public void testGetCanCount()
    {
        VendingMachine vendingMachine = new VendingMachine(50);
        assertEquals(50, vendingMachine.getCanCount());
        vendingMachine.fillUp(150);
        assertEquals(200, vendingMachine.getCanCount());
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine vendingMachine = new VendingMachine(50);
        assertEquals(0, vendingMachine.getTokenCount());
        vendingMachine.insertToken();
        assertEquals(1, vendingMachine.getTokenCount());
    }
}
