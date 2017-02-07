import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computer
{
    private HashMap<String, Component> configuration;
    private String name;

    /**
     * Constructor for objects of class Computer
     */
    public Computer(String name)
    {
        configuration = new HashMap<>();
        this.name = name;
    }

    /**
     * getting and setting name for the Computer
     */
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * calculating the cost of the computer
     */
    public int getComputerCost()
    {
        int computerCost = 0;

        for(Component component : configuration.values()){
            computerCost += component.getCost();
        }

        return computerCost;
    }
    
    /**
     * Printing the cost of the computer
     */
    public void printTotalValue( )
    {
        System.out.println("Cost = ´" + this.getComputerCost());
    }
    
    /**
     * Displaying the summary of computer
     */
    public void printComputerSummary()
    {
        if(configuration.values().size() > 0)
        {
            System.out.println("Name: " + name);
            System.out.println("List of Components:");
        }

        for(Component component : configuration.values()){
            System.out.println("Cost: " + component.getCost() + " Description: " + component.getDescription());
        }
    }
    
    /**
     * Adding and removing components from the computer.
     */
    public void addComponent(String name, Component c)
    {
        configuration.put(name, c);
    }
    
    public void removeComponent(String name)
    {
        configuration.remove(name);
    }
}