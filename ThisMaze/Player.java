import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{   
    private int timer = 0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        barrierSpawn();
    }
    public void movement()
    {
        int speed = 5; 
        int startX = getX(), startY = getY();
        
        if(Greenfoot.isKeyDown("w")) 
        {
            setLocation (getX(), getY() - speed); 
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setImage(new GreenfootImage("Player1.png"));
            setLocation (getX() - speed, getY()); 
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation (getX(), getY() + speed); 
            
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setImage(new GreenfootImage("player.png"));
            setLocation (getX() + speed, getY()); 
        }
        //if(isTouching(tempBarrier.class)) setLocation(startX, startY);
        
    }
    
    public void turnAwayFrom(Actor actor)
    {
        turnTowards(actor.getX(), actor.getY());
        turn(180); 
    }
    public void barrierSpawn()
    {
        if(timer>0)timer--;
        if (timer ==0 &&Greenfoot.isKeyDown("space"))
       {
           tempBarrier barrier = new tempBarrier();
           getWorld().addObject(barrier, getX(), getY());
           timer=300;
           
       }
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
