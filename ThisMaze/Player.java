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
        int speed = 5; 
        int oppDir = -5; 

        if(collisionBarrier() == false) 
            movement();
        if(collisionBarrier() == true)
            setLocation(getX()+speed, getY()+speed); 
        if(collisionWall() == false) 
            movement();
        if(collisionWall() == true)
            woahBackUp(speed); 
            
            
            barrierSpawn();
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
        
        
    }
    
    public boolean collisionBarrier() {
        if(isTouching(tempBarrier.class))
            return true; 
        else
            return false; 
    }
    
    public boolean collisionWall() {
        if(isTouching(Wall1.class))
            return true; 
        else
            return false; 
    }
    
    public void barrierSpawn()
    {
        if(timer>0)timer--;
        if (timer == 0 && Greenfoot.isKeyDown("space"))
       {
           //Creating barrier 
           tempBarrier barrier = new tempBarrier();
           
           //Grabbing X and Y coordinates for player and telling the game to place a barrier at that location
           getWorld().addObject(barrier, getX()+3, getY()+3);
           
           //Setting timer to 300
           timer=300;
           
       }
    }
    
    public void woahBackUp(int speed)
    {
         
        move(-speed); 
    }
}
