

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int Bottles;
    private int Coins;
   
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int starting_soda)
    {
        // initialise instance variables
        this.Bottles = starting_soda;
        this.Coins = 0;
        
    }
    
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
        this.Bottles = 12;
        this.Coins = 0;
        
    }
    
    /**
     * Fills Vending machine up with the cans
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int numberOfBottles)
    {
        // put your code here
        this.Bottles += numberOfBottles;
    }
     /**
     * 
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int insertCoin(int coinsInserted)
    {
        // put your code here
        this.Coins += coinsInserted;
        this.Bottles -= tokensInserted;
        return Coins + Bottles;
    }
    
    
}
