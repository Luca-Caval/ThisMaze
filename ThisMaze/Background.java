import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Win win = new Win();
        addObject(win,15,16);
        Player player = new Player();
        addObject(player,549,554);
        Enemy enemy = new Enemy();
        addObject(enemy,80,79);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,268,76);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,63,228);
    }
}
