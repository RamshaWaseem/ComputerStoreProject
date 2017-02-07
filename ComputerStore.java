import java.util.ArrayList; 
import java.util.Iterator;
/**
 * Write a description of class ComputerStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerStore
{
    // instance variables - replace the example below with your own
    private ArrayList<Computer> computers;
    private ArrayList<Component> components;

    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore()
    {
        /**
     * Construct an empty omputerStore.
     */
        computers = new ArrayList<>();
        components = new ArrayList<>();
    }

    /**
     * Add and remove computer to ComputerStore
     */
    public boolean addComputer(Computer newComputer)
    {
        boolean addResult = false; 
        try {
           computers.add(newComputer);
           addResult = true;
        }catch(Exception ex) {
           ex.printStackTrace();
        }finally {
           return addResult;
        }
    }
    
    public boolean removeComputer(int index)
    {
        if(index >= 0 && index < computers.size()){
            computers.remove(index);
        }
        return true;
    }
    
    
    /**
     * Show all the Computers in Computerstore
     */
    public void printAllComputers( )
    {
        for(Computer allComputer : computers){
            allComputer.printComputerSummary();
        }
    }
    
    /**
     * Print Computer Value
     */
    public void printTotalValue( )
    {
        for(Computer computerValue : computers){
            computerValue.printTotalValue();
        }
    }
    
    /**
     * Creating most expensive method with "For loop"
     */
    public Computer findMostExpensiveComputerV1( )
    {   Computer currentMostExpensive = computers.get(0);
        for(int i = 1; i < computers.size(); i++){
            if(computers.get(i).getComputerCost() > currentMostExpensive.getComputerCost()){
                currentMostExpensive = computers.get(i);
            }
        }
        System.out.print("Most expensive computer = ");
        currentMostExpensive.printComputerSummary();
        return currentMostExpensive;
    }
    
    /**
     * Creating most expensive method with "While loop"
     */
    public Computer findMostExpensiveComputerV2( )
    {
        Computer currentMostExpensive = computers.get(0);
        int i = 1;
        while(i < computers.size()){
            if(computers.get(i).getComputerCost() > currentMostExpensive.getComputerCost()){
                currentMostExpensive = computers.get(i);
            }
            i++;
        }
        System.out.print("Most expensive computer = ");
        currentMostExpensive.printComputerSummary();
        return currentMostExpensive;
    }
    
    /**
     * Creating most expensive method with "Foreach loop"
     */
    public Computer findMostExpensiveComputerV3( )
    {
        Computer currentMostExpensive = computers.get(0);
        for(Computer computer : computers){
            if(computer.getComputerCost() > currentMostExpensive.getComputerCost()){
                currentMostExpensive = computer;
            }
        }
        System.out.print("Most expensive computer = ");
        currentMostExpensive.printComputerSummary();
        return currentMostExpensive;
    
    }
    
    /**
     * Creating most expensive method using Iterator
     */
    public Computer findMostExpensiveComputerV4( )
    {
        Computer currentMostExpensive = computers.get(0);
        Iterator<Computer> it = computers.iterator();
        while(it.hasNext()){
            Computer computer = it.next();
            if(computer.getComputerCost() > currentMostExpensive.getComputerCost()){
                currentMostExpensive = computer;
            }
        }
        System.out.print("Most expensive computer = ");
        currentMostExpensive.printComputerSummary();
        return currentMostExpensive;
    }
    
    /**
     * Finding the total cost of components
     */
    public int totalCostOfComponents( )
    {
        int totalCost = 0;
        for(Component component : components){
            totalCost += component.getCost();
        }
        return totalCost;
    }
    
    /**
     * Finding total cost of the Components
     * @param component_type The component_type of the component to find its cost.
     */
    public int totalCostOfComponents(String component_type)
    {
        int totalCost = 0;
        
        for(Component component : components){
            if(component.getClass().getSimpleName().equals(component_type))
            {
                totalCost += component.getCost();
            }
        }
        return totalCost;
    }

    /**
     * Adding components to the Computer Store
     */
    public void addComponent(Component c)
    {
        components.add(c);
    }
}