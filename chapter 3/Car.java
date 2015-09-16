

/**
 *A car 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon (mpg) */
    private double fuelEfficiency;
    /** amount of fuel left in the car's tank in gallon */
    private double fuelInTank;
    
    /**
     * Default constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car( double fuelEfficiency)
    {
        // initialise instance variables
        fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount of fuel in the tank
     *
     * @pre        specified distance cnnot result in the comnsumption of more gas than is availabile
     *            (what the method assumes about the method's parameters and class's state)
     *
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void drive( double distance )
    {
        fuelInTank -= distance/ fuelEfficiency;
        
    }
    /**
     * Returns the amount of gas in the car's tank in units of gallons
     * 
     * @return the amount of gas in the car's tank in units of gallons 
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }
    /**
     * Increments the fuel in the car's Tank by the specified amount in gallons
     *
     * @pre     gallonsOfGas must be a positive number
   
     * @param   gallonsOfGas amount of gas to add to the car's tank in gallons
     * @return  description of the return value
     */
    public void addGas( double gallonsOfGas )
    {
        fuelInTank += gallonsOfGas;
    }

}
