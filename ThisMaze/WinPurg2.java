import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPurg2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPurg2 extends Actor
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
        World Plvl3 =  new  Plvl3();
        Greenfoot.setWorld(Plvl3);
        Greenfoot.playSound("WeBack.wav");
    }
}