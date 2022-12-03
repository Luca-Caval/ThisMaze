import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPurg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPurg extends Actor
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
        World Plvl2 =  new  Plvl2();
        Greenfoot.setWorld(Plvl2);
    }
}
