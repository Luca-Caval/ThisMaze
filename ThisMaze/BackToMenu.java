import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMenu extends Actor
{
    /**
     * Act - do whatever the BackToMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("MainMenuButton.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("MainMenuButton.png");
        }

        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
    
        }
    }
}