import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win3 extends Actor
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
        World lvl4 =  new  lvl4();
        Greenfoot.setWorld(lvl4);
    }
}