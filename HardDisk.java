
/**
 * Write a description of class HardDisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardDisk extends Component
{
    /**
     * fields of the class Hardware
     */
    private String _type;
    private int _capacity;

    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk(String manufacturer, int cost, int capacity, String type)
    {
        super(manufacturer, cost);
        this._capacity = capacity;
        this._type = type;
    }

    /**
     * getting and setting the type of hardware
     */
    public String getType () 
    {
        return _type;
    }
    
    public void setType (String type) 
    {
        this._type = type;
    }
    
    /**
     * getting and setting the capacity of hardware
     */
    public int getCapacity () 
    {
        return _capacity;
    }
    
    public void setCapacity (int capacity) 
    {
        this._capacity = capacity;
    }

    /**
     * Description method of the hardware
     */
    public String getDescription()
    {
        return "Harddisk=> " + super.getDescription() + ", Capacity: " + this.getCapacity() + "GB, " + this.getType();
    }
}