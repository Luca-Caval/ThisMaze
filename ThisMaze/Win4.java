import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win4 extends Actor
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
        World lvl5 =  new  lvl5();
        Greenfoot.setWorld(lvl5);
        Greenfoot.playSound("win.wav"); 
    }
}