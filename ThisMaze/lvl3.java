import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3 extends World
{

    /**
     * Constructor for objects of class lvl3.
     * 
     */
    public lvl3()
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
        Win3 win3 = new Win3();
        addObject(win3,44,43);
        Gate gate = new Gate();
        addObject(gate,131,45);
        Gate gate2 = new Gate();
        addObject(gate2,129,121);
        Gate gate3 = new Gate();
        addObject(gate3,130,197);
        Gate gate4 = new Gate();
        addObject(gate4,129,273);
        Gate gate5 = new Gate();
        addObject(gate5,129,349);
        Gate gate6 = new Gate();
        addObject(gate6,129,424);
        Gate gate7 = new Gate();
        addObject(gate7,129,500);
        Gate gate8 = new Gate();
        addObject(gate8,130,575);
        Gate gate9 = new Gate();
        addObject(gate9,129,652);
        Gate gate10 = new Gate();
        addObject(gate10,210,653);
        Gate gate11 = new Gate();
        addObject(gate11,287,654);
        Gate gate12 = new Gate();
        addObject(gate12,365,655);
        Gate gate13 = new Gate();
        addObject(gate13,441,656);
        Gate gate14 = new Gate();
        addObject(gate14,516,657);
        Gate gate15 = new Gate();
        addObject(gate15,590,657);
        Gate gate16 = new Gate();
        addObject(gate16,665,657);
        Gate gate17 = new Gate();
        addObject(gate17,666,580);
        Gate gate18 = new Gate();
        addObject(gate18,663,505);
        Gate gate19 = new Gate();
        addObject(gate19,663,429);
        Gate gate20 = new Gate();
        addObject(gate20,585,428);
        Gate gate21 = new Gate();
        addObject(gate21,510,426);
        Gate gate22 = new Gate();
        addObject(gate22,435,426);
        Gate gate23 = new Gate();
        addObject(gate23,363,424);
        Gate gate24 = new Gate();
        addObject(gate24,286,424);
        Gate gate25 = new Gate();
        addObject(gate25,285,349);
        Gate gate26 = new Gate();
        addObject(gate26,284,274);
        Gate gate27 = new Gate();
        addObject(gate27,281,119);
        Gate gate28 = new Gate();
        addObject(gate28,280,46);
        Gate gate29 = new Gate();
        addObject(gate29,360,273);
        Gate gate30 = new Gate();
        addObject(gate30,513,276);
        Gate gate31 = new Gate();
        addObject(gate31,588,276);
        Gate gate32 = new Gate();
        addObject(gate32,663,274);
        Gate gate33 = new Gate();
        addObject(gate33,661,198);
        Gate gate34 = new Gate();
        addObject(gate34,355,46);
        Gate gate35 = new Gate();
        addObject(gate35,432,46);
        Gate gate36 = new Gate();
        addObject(gate36,507,45);
        Gate gate37 = new Gate();
        addObject(gate37,581,46);
        Gate gate38 = new Gate();
        addObject(gate38,655,46);
        Gate gate39 = new Gate();
        addObject(gate39,441,582);
        Gate gate40 = new Gate();
        addObject(gate40,284,500);
        Player player = new Player();
        addObject(player,586,582);
        Enemy enemy = new Enemy();
        addObject(enemy,705,715);
        enemy.setLocation(718,722);
    }
}
