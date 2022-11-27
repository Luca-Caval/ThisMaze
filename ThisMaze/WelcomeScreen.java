import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeScreen extends World
{
    
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    /**
     * Constructor for objects of class WelcomeScreen.
     * 
     */
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("This is place holder and idk", getWidth()/2, 60);
        showText("Press Space Bar or wait idk like 5 seconds", getWidth()/2, 110);
    }
    
        public void act()
    {
        Display display = new Display();
        addObject(display , 280, 500);
        
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
        
        display.setImage(new GreenfootImage("Timer Value :" + timerValue , 35, Color.WHITE, Color.BLACK, Color.YELLOW));
        

        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Background()); 

        }

        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (5 * 1000)))
        {
            Greenfoot.setWorld(new Background()); 
        }

    }
}
