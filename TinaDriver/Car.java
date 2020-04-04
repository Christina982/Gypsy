
/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String color;
    private String shape;
    private int doors;
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setShape(String shape){
        this.shape = shape;
    }
        
        
    public void setDoors(int doors){
        this.doors = doors;
    }    
    
    public String getColor(){
        return this.color;
    }
    
    public String getShape(){
        return this.shape;
    }
    
    public int getDoors(){
        return this.doors;
    }
}