
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor extends Component
{
    // instance variables - replace the example below with your own
    private double _clockSpeed;

    /**
     * Constructor for objects of class Processor
     */
    public Processor(String manufacturer, int cost, int clockSpeed)
    {
        // initialise instance variables
        super(manufacturer, cost);
        this._clockSpeed = clockSpeed;
    }

    /**
     * getting and setting the Clockspeed of Processor
     */
    public double getClockSpeed () 
    {
        return _clockSpeed;
    }
    
    public void setClockSpeed (double clockSpeed) 
    {
        this._clockSpeed = clockSpeed;
    }

    /**
     * printing the details of the processor
     */
    public String getDescription()
    {
        return "Processor=> " + super.getDescription() + ", Clock speed: " + this.getClockSpeed() + " GHz";
    }
}