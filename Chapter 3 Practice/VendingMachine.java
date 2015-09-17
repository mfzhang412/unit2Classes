

/**
 * The class VendingMachine has soda in it. The number of soda is reduced when the number
 * of tokens increases.
 * 
 * @author Michael Zhang
 * @version 17 September 2015
 */
public class VendingMachine
{
    /** Initializes the vending machine's soda count at 10 */
    private int numberCans;
    
    /** Specifies the vending machine's token count */
    private int numberTokens;

    /**
     * Constructor for objects of class VendingMachine that specifies the number of cans.
     */
    public VendingMachine(int cans)
    {
        this.numberCans = cans;
    }

    /**
     * Adds soda cans to the vending machine.
     *
     * @param    cans    The specified number of cans put into the vending machine.
     */
    public void fillUp(int cans)
    {
        numberCans += cans;
    }
    
    /**
     * Simulates what happens when a user inputs a token by increasing token count while
     * decreasing soda can count.
     *
     * @pre     There is soda inside the vending machine.
     */
    public void insertToken()
    {
        this.numberTokens += 1;
        this.numberCans -= 1;
    }
    
    /**
     * Returns the number of soda cans in the vending machine.
     * 
     * @return  The number of soda cans in the vending machine.
     */
    public int getCanCount()
    {
        return this.numberCans;
    }
    
    /**
     * Returns the amount of tokens in the vending machine.
     *
     * @return  The amount of tokens in the vending machine.
     */
    public int getTokenCount()
    {
        return this.numberTokens;
    }

}
