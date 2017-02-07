 /**
 * Write a description of class Component here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Component
{
    /**
     * Components cost 
     */
    private int _cost;
    private String _manufacturer;

    /**
     * Constructor for objects of class Component
     * @param author    The Cost  of the Components.
     */
    public Component(String manufacturer, int cost)
    {
        this._manufacturer = manufacturer;
        this._cost = cost;
    }

    /**
     * get cost of the components
     */
    public int getCost () 
    {
        return _cost;
    }
    
    /**
     * set cost of the components
     */
    public void setCost (int cost) 
    {
        this._cost = cost;
    }
    
    /**
     * get manufacture of the components
     */
    public String getManufacturer()
    {
        return _manufacturer;
    }
    
    /**
     * set manufacture of the components
     */
    public void setManufacturer (String manufacturer) 
    {
        this._manufacturer = manufacturer;
    }
    
    /**
     * Print the description of this component.
     */
    public String getDescription()
    {
        return "Manufacturer: " + getManufacturer();
    }
}