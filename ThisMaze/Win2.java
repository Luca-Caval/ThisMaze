import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win2 extends Actor
{
    public void act()
    {
        if (winCondition() == true) {
            transitionToWinWorld();
        }
    }

    /**
     * 
     */
    public boolean winCondition()
    {
        if (isTouching(Player.class)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToWinWorld()
    {
        World lvl3 =  new  lvl3();
        Greenfoot.setWorld(lvl3);
        Greenfoot.playSound("win.wav"); 
    }
}
