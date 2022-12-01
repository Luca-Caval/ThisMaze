import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy()
    {
        GreenfootImage image = getImage();
        image.scale(39,40);
        setImage(image);
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       followPlayer();
       gameRestart();
    }
    
    public void followPlayer()
    {
        //Defining what the player variable is and where to retrieve it 
       Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
        //Defining variables for startX and startY
       int startX = getX(); 
       int startY = getY();
       
       //Having enemy move at a consistent speed of 3
       move(3); 
       
       //Stopping enemy movement when met with barrier
       if(isTouching(tempBarrier.class)) 
           setLocation(startX-1, startY-1);

       
       //Turning towards player so that the AI is constantly point towards it 
       turnTowards(player.getX(), player.getY()); 
       
       //If there is no player in the world it returns and does nothing 
       if (getWorld().getObjects(Player.class).isEmpty())
           return;
            //Greenfoot.playSound("Death sound");  
    }
    
    
    private void gameRestart()                       //Restarts the world
    {   Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
        
        if(isTouching(Player.class))
        Greenfoot.setWorld(new Background());
    }
}
