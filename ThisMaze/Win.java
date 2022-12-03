import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Win here.
 * @author (your name) @version (a version number or a date)
 */
public class Win extends Actor
{

    //For Level 1 Surface

    /**
     * Act - do whatever the Win wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        World lvl2 =  new  lvl2();
        Greenfoot.setWorld(lvl2);
    }
}
