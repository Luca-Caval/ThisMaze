import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl1 extends World
{

    /**
     * Constructor for objects of class lvl1.
     * 
     */
    public lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Win win = new Win();
        addObject(win,14,19);
        Gate gate = new Gate();
        addObject(gate,111,108);
        Gate gate2 = new Gate();
        addObject(gate2,177,167);
        Gate gate3 = new Gate();
        addObject(gate3,244,226);
        Gate gate4 = new Gate();
        addObject(gate4,310,285);
        Gate gate5 = new Gate();
        addObject(gate5,377,346);
        Gate gate6 = new Gate();
        addObject(gate6,444,409);
        Enemy enemy = new Enemy();
        addObject(enemy,351,82);
        enemy.setLocation(246,86);
        Player player = new Player();
        addObject(player,711,721);
        Gate gate7 = new Gate();
        addObject(gate7,446,484);
        Gate gate8 = new Gate();
        addObject(gate8,519,408);
        Gate gate9 = new Gate();
        addObject(gate9,594,409);
        Gate gate10 = new Gate();
        addObject(gate10,445,558);
        Gate gate11 = new Gate();
        addObject(gate11,594,332);
        Gate gate12 = new Gate();
        addObject(gate12,594,257);
        Gate gate13 = new Gate();
        addObject(gate13,594,180);
        Gate gate14 = new Gate();
        addObject(gate14,592,105);
        Gate gate15 = new Gate();
        addObject(gate15,368,560);
        Gate gate16 = new Gate();
        addObject(gate16,290,560);
        Gate gate17 = new Gate();
        addObject(gate17,211,560);
        Gate gate18 = new Gate();
        addObject(gate18,135,559);
    }
}
