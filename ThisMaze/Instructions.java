import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("InstructionsButton.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("InstructionsButton.png");
        }

        if (Greenfoot.mouseClicked(this))
        {

            Greenfoot.setWorld(new InstructionsPage());

        }
    }
}