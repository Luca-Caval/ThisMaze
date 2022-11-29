import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsPage extends World
{

    /**
     * Constructor for objects of class InstructionsPage.
     * 
     */
    public InstructionsPage()
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
        BackToMenu backToMenu = new BackToMenu();
        addObject(backToMenu,477,564);
    }
}
