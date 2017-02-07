
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Component
{
    /**
     * fields for the Display Class
     */
    private int _size;
    private int _resolution;

    /**
     * Constructor for objects of class Display
     */
    public Display(String manufacturer, int cost, int size, int resolution)
    {
        // initialise instance variables
        super(manufacturer, cost);
        this._size = size;
        this._resolution = resolution;
    }

    /**
     * getting and setting the size of Display
     */
	
    public int getSize () 
    {
        return _size;
    }
    
    public void setSize (int size) 
    {
        this._size = size;
    }

    /**
     * getting and setting the Resolution of Display
     */
    public int getResolution () 
    {
        return _resolution;
    }
    
    public void setResolution (int resolution) 
    {
        this._resolution = resolution;
    }

    public String getDescription()
    {
        return "Display=> " + super.getDescription() + ", Size: " + this.getSize() + "\", Resolution: " + this.getResolution() + " Pixel";
    }
}