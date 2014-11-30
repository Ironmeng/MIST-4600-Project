import java.util.Random;
/**
 * Write a description of class Trigger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trigger
{
    // instance variables - replace the example below with your own
    private Random randomIntGen;
     
    /**
     * Constructor for objects of class Trigger
     */
    public Trigger()
    {
        randomIntGen = new Random();
    }
     
   
    public boolean fire(int prob)
    {
        
     int thisInt = randomIntGen.nextInt(prob);
       if(thisInt == prob-1){
           return true;
        }
      return false;
         
    }
    
    public boolean fire2(int prob)
    {
        
     int thisInt = randomIntGen.nextInt(prob);
       if(thisInt == prob-1){
           return true;
        }
      return false;
         
    }
    

    public int getRandomNumber(int size)
    {
        int thisRandomNumber = randomIntGen.nextInt(size);
      
           return thisRandomNumber;
        
    }
}
