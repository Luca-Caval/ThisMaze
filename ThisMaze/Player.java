import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement(); 
    }
    
    public void movement()
    {
        int speed = 5; 
        
        
        if(Greenfoot.isKeyDown("w")) 
        {
            setLocation (getX(), getY() - speed); 
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation (getX() - speed, getY()); 
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation (getX(), getY() + speed); 
            
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation (getX() + speed, getY()); 
        }
        
    }
    
    public void turnAwayFrom(Actor actor)
    {
        turnTowards(actor.getX(), actor.getY());
        turn(180); 
    }
    
    public void barrierStop() 
    {
        if(isTouching(tempBarrier.class) && Greenfoot.isKeyDown("w")) 
        {
            Actor barrier = getOneIntersectingObject(tempBarrier.class); 
            
            turnAwayFrom(barrier); 
            move(5); 
            
        }
        
    }
}
