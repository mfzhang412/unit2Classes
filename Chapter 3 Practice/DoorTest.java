

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
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
    public void testCloseDoor()
    {
        Door door = new Door("Front","open");
        door.closeDoor();
        assertEquals( "close", door.getState() );
    }

    @Test
    public void testOpenDoor()
    {
        Door door = new Door("Front","close");
        door.openDoor();
        assertEquals( "open", door.getState() );
    }

    @Test
    public void testGetState()
    {
        Door door = new Door("Front","close");
        assertEquals("close", door.getState() );
    }

    @Test
    public void testGetName()
    {
        Door door = new Door("Front","close");
        assertEquals("Front", door.getName() );
    }
    
    @Test
    public void testSetState()
    {
        Door door = new Door("Front","close");
        door.setState("open");
        assertEquals("open", door.getState() );
    }

    @Test
    public void testSetName()
    {
        Door door = new Door("Front","close");
        door.setName("Back");
        assertEquals("Back", door.getName() );
    }
}
