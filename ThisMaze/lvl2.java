import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{

    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
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

        Win2 win2 = new Win2();
        addObject(win2,391,726);
        Enemy enemy = new Enemy();
        addObject(enemy,411,649);
        enemy.setLocation(398,663);
        Player player = new Player();
        addObject(player,378,59);
        Gate gate = new Gate();
        addObject(gate,312,715);
        Gate gate2 = new Gate();
        addObject(gate2,467,714);
        Gate gate3 = new Gate();
        addObject(gate3,311,644);
        Gate gate4 = new Gate();
        addObject(gate4,311,574);
        Gate gate5 = new Gate();
        addObject(gate5,310,504);
        Gate gate6 = new Gate();
        addObject(gate6,296,435);
        Gate gate7 = new Gate();
        addObject(gate7,282,368);
        Gate gate8 = new Gate();
        addObject(gate8,266,299);
        Gate gate9 = new Gate();
        addObject(gate9,466,641);
        Gate gate10 = new Gate();
        addObject(gate10,466,571);
        Gate gate11 = new Gate();
        addObject(gate11,464,502);
        Gate gate12 = new Gate();
        addObject(gate12,478,431);
        Gate gate13 = new Gate();
        addObject(gate13,491,360);
        Gate gate14 = new Gate();
        addObject(gate14,505,292);
        Gate gate15 = new Gate();
        addObject(gate15,266,228);
        Gate gate16 = new Gate();
        addObject(gate16,263,94);
        Gate gate17 = new Gate();
        addObject(gate17,500,90);
        Gate gate18 = new Gate();
        addObject(gate18,506,225);
        Gate gate19 = new Gate();
        addObject(gate19,330,107);
        Gate gate20 = new Gate();
        addObject(gate20,433,108);
        Gate gate21 = new Gate();
        addObject(gate21,571,92);
        Gate gate22 = new Gate();
        addObject(gate22,711,92);
        Gate gate23 = new Gate();
        addObject(gate23,711,158);
        Gate gate24 = new Gate();
        addObject(gate24,711,226);
        Gate gate25 = new Gate();
        addObject(gate25,713,294);
        Gate gate26 = new Gate();
        addObject(gate26,639,292);
        Gate gate27 = new Gate();
        addObject(gate27,570,292);
        Gate gate28 = new Gate();
        addObject(gate28,195,299);
        Gate gate29 = new Gate();
        addObject(gate29,122,299);
        Gate gate30 = new Gate();
        addObject(gate30,49,297);
        Gate gate31 = new Gate();
        addObject(gate31,34,229);
        Gate gate32 = new Gate();
        addObject(gate32,32,160);
        Gate gate33 = new Gate();
        addObject(gate33,30,92);
        Gate gate34 = new Gate();
        addObject(gate34,44,22);
        Gate gate35 = new Gate();
        addObject(gate35,698,25);
        Gate gate36 = new Gate();
        addObject(gate36,190,95);
    }
}
