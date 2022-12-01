import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(871, 828, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayGame playGame = new PlayGame();
        addObject(playGame,293,287);
        Instructions instructions = new Instructions();
        addObject(instructions,465,551);
        playGame.setLocation(686,287);
        removeObject(playGame);
        removeObject(instructions);
        PlayGame PlayGame = new PlayGame();
        addObject(playGame,660,332);
        playGame.setLocation(634,328);
        Instructions instructions2 = new Instructions();
        addObject(instructions2,640,476);
        instructions2.setLocation(711,483);
        instructions2.setLocation(605,480);
        instructions2.setLocation(649,476);
        instructions2.setLocation(625,488);
        instructions2.setLocation(621,489);
        instructions2.setLocation(616,467);
        instructions2.setLocation(589,534);
        instructions2.setLocation(654,466);
        instructions2.setLocation(629,452);
        instructions2.setLocation(664,458);
        instructions2.setLocation(629,481);
        instructions2.setLocation(647,472);
        instructions2.setLocation(661,468);
        instructions2.setLocation(638,466);
    }
}