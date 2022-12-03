import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plvl3 extends World
{

    /**
     * Constructor for objects of class Plvl3.
     * 
     */
    public Plvl3()
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

        Wall wall = new Wall();
        addObject(wall,27,417);
        Wall wall2 = new Wall();
        addObject(wall2,28,372);
        Wall wall3 = new Wall();
        addObject(wall3,27,327);
        Wall wall4 = new Wall();
        addObject(wall4,26,282);
        Wall wall5 = new Wall();
        addObject(wall5,26,239);
        Wall wall6 = new Wall();
        addObject(wall6,26,193);
        Wall wall7 = new Wall();
        addObject(wall7,23,150);
        Wall wall8 = new Wall();
        addObject(wall8,21,107);
        Wall wall9 = new Wall();
        addObject(wall9,39,62);
        Wall wall10 = new Wall();
        addObject(wall10,89,59);
        Wall wall11 = new Wall();
        addObject(wall11,137,59);
        Wall wall12 = new Wall();
        addObject(wall12,188,60);
        Wall wall13 = new Wall();
        addObject(wall13,200,102);
        Wall wall14 = new Wall();
        addObject(wall14,216,143);
        Wall wall15 = new Wall();
        addObject(wall15,210,188);
        Wall wall16 = new Wall();
        addObject(wall16,200,235);
        Wall wall17 = new Wall();
        addObject(wall17,152,241);
        Wall wall18 = new Wall();
        addObject(wall18,175,285);
        Wall wall19 = new Wall();
        addObject(wall19,188,329);
        Wall wall20 = new Wall();
        addObject(wall20,200,375);
        Wall wall21 = new Wall();
        addObject(wall21,220,423);
        Wall wall22 = new Wall();
        addObject(wall22,269,61);
        Wall wall23 = new Wall();
        addObject(wall23,448,61);
        Wall wall24 = new Wall();
        addObject(wall24,509,61);
        Wall wall25 = new Wall();
        addObject(wall25,727,65);
        Wall wall26 = new Wall();
        addObject(wall26,745,421);
        Wall wall27 = new Wall();
        addObject(wall27,521,423);
        Wall wall28 = new Wall();
        addObject(wall28,421,423);
        Wall wall29 = new Wall();
        addObject(wall29,307,417);
        Wall wall30 = new Wall();
        addObject(wall30,298,368);
        Wall wall31 = new Wall();
        addObject(wall31,294,322);
        Wall wall32 = new Wall();
        addObject(wall32,290,274);
        Wall wall33 = new Wall();
        addObject(wall33,284,226);
        Wall wall34 = new Wall();
        addObject(wall34,281,178);
        Wall wall35 = new Wall();
        addObject(wall35,279,128);
        Wall wall36 = new Wall();
        addObject(wall36,443,112);
        Wall wall37 = new Wall();
        addObject(wall37,443,162);
        Wall wall38 = new Wall();
        addObject(wall38,440,210);
        Wall wall39 = new Wall();
        addObject(wall39,433,260);
        Wall wall40 = new Wall();
        addObject(wall40,430,305);
        Wall wall41 = new Wall();
        addObject(wall41,416,367);
        Wall wall42 = new Wall();
        addObject(wall42,365,424);
        Wall wall43 = new Wall();
        addObject(wall43,518,375);
        Wall wall44 = new Wall();
        addObject(wall44,519,327);
        Wall wall45 = new Wall();
        addObject(wall45,518,276);
        Wall wall46 = new Wall();
        addObject(wall46,516,228);
        Wall wall47 = new Wall();
        addObject(wall47,514,180);
        Wall wall48 = new Wall();
        addObject(wall48,511,129);
        Wall wall49 = new Wall();
        addObject(wall49,563,115);
        Wall wall50 = new Wall();
        addObject(wall50,583,168);
        Wall wall51 = new Wall();
        addObject(wall51,601,217);
        Wall wall52 = new Wall();
        addObject(wall52,619,268);
        Wall wall53 = new Wall();
        addObject(wall53,647,320);
        Wall wall54 = new Wall();
        addObject(wall54,670,379);
        Wall wall55 = new Wall();
        addObject(wall55,697,428);
        Wall wall56 = new Wall();
        addObject(wall56,733,368);
        Wall wall57 = new Wall();
        addObject(wall57,731,316);
        Wall wall58 = new Wall();
        addObject(wall58,730,263);
        Wall wall59 = new Wall();
        addObject(wall59,729,220);
        Wall wall60 = new Wall();
        addObject(wall60,728,162);
        Wall wall61 = new Wall();
        addObject(wall61,728,108);
        Win win = new Win();
        addObject(win,87,243);
        Player player = new Player();
        addObject(player,601,434);
        EnemyPurg enemyPurg = new EnemyPurg();
        addObject(enemyPurg,104,704);
        EnemyPurg enemyPurg2 = new EnemyPurg();
        addObject(enemyPurg2,435,706);
        EnemyPurg enemyPurg3 = new EnemyPurg();
        addObject(enemyPurg3,662,712);
        enemyPurg2.setLocation(414,691);
        enemyPurg.setLocation(649,81);
        enemyPurg2.setLocation(676,523);
        player.setLocation(407,611);
    }
}
