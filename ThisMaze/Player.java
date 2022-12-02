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
            setLocation(getX()-speed, getY()-speed); 
        
            
            
            barrierSpawn();
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("w")) 
        {
          setRotation(270);
          move(5);
          collisionWall();
          collisionGate();
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
          setRotation(180);
          move(5); 
          collisionWall();
          collisionGate();
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
          setRotation(90);
          move(5);
          collisionWall();
          collisionGate();
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
          setRotation(0);
          move(5); 
          collisionWall();
          collisionGate();
        }
        
    }
    
      public void collisionWall()
    {
        Actor wall1 = getOneIntersectingObject(Wall.class);
        if(wall1 != null)
        {
            move(-5);
        }
    }
    
      public void collisionGate()
    {
        Actor gate = getOneIntersectingObject(Gate.class);
        if(gate != null)
        {
            move(-5);
        }
    }
    
    public boolean collisionBarrier() {
        if(isTouching(tempBarrier.class))
            return true; 
        else
            return false; 
    }
   

    
    public void barrierSpawn()
    {
        if(timer > 0) 
            timer--;
        
        if (timer == 0 && Greenfoot.isKeyDown("space"))
       {
           //Creating barrier 
           tempBarrier barrier = new tempBarrier();
           
           //Grabbing X and Y coordinates for player and telling the game to place a barrier at that location
           getWorld().addObject(barrier, getX(), getY());
           
           //Setting timer to 300
           timer=300;
           
       }
    }
    
    

}
