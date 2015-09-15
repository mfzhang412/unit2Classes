

/**
 * Program that models the properties of a door.
 * 
 * @author Zhang, Michael
 * @15 September 2015
 */
public class Door
{
    /**Instance variable that specifies the name of the door */
    private String doorName;
    
    /**Instance variable that specifies the current state of the door */
    private String doorState;

    /**
     * Constructor for class Door that specifies
     */
    public Door(String name, String initialState)
    {
        this.doorName = name;
        this.doorState = initialState;
    }

    /**
     * Method that closes the door.
     *
     * @post    Instance variable 'doorState' will be "close".
     */
    public void closeDoor()
    {
        this.doorState = "close";
    }

    /**
     * Method that opens the door.
     *
     * @post    Instance variable 'doorState' will be "open".
     */
    public void openDoor()
    {
        this.doorState = "open";
    }
    
    /**
     * Returns the door's name.
     * 
     * @return  Returns door's name.
     */
    public String getName()
    {
        return this.doorName;
    }

    /**
     * Returns the door's state.
     *
     * @return  Returns the door's state.
     */
    public String getState()
    {
        return this.doorState;
    }
    
    /**
     * Sets the door's name.
     *
     * @post    Door's name is set to specified name.
     * 
     * @param   newName   New name of door.
     */
    public void setName(String newName)
    {
        this.doorName = newName;
    }

    /**
     * Sets the door's state.
     *
     * @post    Door's state is set to specified state.
     * 
     * @param   newState    New state of door.
     */
    public void setState(String newState)
    {
        this.doorState = newState;
    }

}
