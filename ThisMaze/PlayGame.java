import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGame extends Actor
{
    /**
     * Act - do whatever the PlayGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("PlayGameButton.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("PlayGameButton.png");
        }

        if (Greenfoot.mouseClicked(this))
        {

            Greenfoot.setWorld(new lvl1());

        }
    }    
}