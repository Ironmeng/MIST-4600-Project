
/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event
{
    private String eventName;
    private String eventDescription;
    private int damage;
    
    private String options;
    
    
    /**
     * Constructor for objects of class Event
     */
    public Event(String peventName,String peventDescription,int pdamage, String poptions)
    {  
        eventName = peventName;
        eventDescription = peventDescription;
        damage = pdamage;
        
        options = poptions;
        
    }

    public String getEventName(){
        return eventName;
        
    }
    public String getEventDescription()
    {
        return eventDescription;
    }
    public int getDamage()
    {
        return damage;
    }
    
    public String getOptions()
    {
        return options;
    }
    
    
}
