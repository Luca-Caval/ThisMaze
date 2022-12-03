import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plvl2 extends World
{

    /**
     * Constructor for objects of class Plvl2.
     * 
     */
    public Plvl2()
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
        addObject(wall,24,582);
        Wall wall2 = new Wall();
        addObject(wall2,73,586);
        Wall wall3 = new Wall();
        addObject(wall3,121,593);
        Wall wall4 = new Wall();
        addObject(wall4,165,601);
        Wall wall5 = new Wall();
        addObject(wall5,213,607);
        Wall wall6 = new Wall();
        addObject(wall6,262,612);
        Wall wall7 = new Wall();
        addObject(wall7,313,611);
        Wall wall8 = new Wall();
        addObject(wall8,364,611);
        Wall wall9 = new Wall();
        addObject(wall9,412,607);
        Wall wall10 = new Wall();
        addObject(wall10,459,593);
        Wall wall11 = new Wall();
        addObject(wall11,508,575);
        Wall wall12 = new Wall();
        addObject(wall12,558,556);
        Wall wall13 = new Wall();
        addObject(wall13,607,539);
        Wall wall14 = new Wall();
        addObject(wall14,609,493);
        Wall wall15 = new Wall();
        addObject(wall15,608,446);
        Wall wall16 = new Wall();
        addObject(wall16,612,389);
        Wall wall17 = new Wall();
        addObject(wall17,608,340);
        Wall wall18 = new Wall();
        addObject(wall18,608,295);
        Wall wall19 = new Wall();
        addObject(wall19,604,252);
        Wall wall20 = new Wall();
        addObject(wall20,603,208);
        Wall wall21 = new Wall();
        addObject(wall21,587,161);
        Wall wall22 = new Wall();
        addObject(wall22,540,154);
        Wall wall23 = new Wall();
        addObject(wall23,492,149);
        Wall wall24 = new Wall();
        addObject(wall24,443,142);
        Wall wall25 = new Wall();
        addObject(wall25,390,141);
        Wall wall26 = new Wall();
        addObject(wall26,334,138);
        Wall wall27 = new Wall();
        addObject(wall27,279,143);
        Wall wall28 = new Wall();
        addObject(wall28,233,149);
        Wall wall29 = new Wall();
        addObject(wall29,183,157);
        Wall wall30 = new Wall();
        addObject(wall30,175,201);
        Wall wall31 = new Wall();
        addObject(wall31,166,247);
        Wall wall32 = new Wall();
        addObject(wall32,155,292);
        Wall wall33 = new Wall();
        addObject(wall33,148,339);
        Wall wall34 = new Wall();
        addObject(wall34,140,390);
        Wall wall35 = new Wall();
        addObject(wall35,160,436);
        Wall wall36 = new Wall();
        addObject(wall36,209,452);
        Wall wall37 = new Wall();
        addObject(wall37,262,467);
        Wall wall38 = new Wall();
        addObject(wall38,312,470);
        Wall wall39 = new Wall();
        addObject(wall39,362,468);
        Wall wall40 = new Wall();
        addObject(wall40,385,424);
        Wall wall41 = new Wall();
        addObject(wall41,415,378);
        Wall wall42 = new Wall();
        addObject(wall42,436,328);
        Wall wall43 = new Wall();
        addObject(wall43,448,280);
        Wall wall44 = new Wall();
        addObject(wall44,399,259);
        Wall wall45 = new Wall();
        addObject(wall45,352,256);
        Wall wall46 = new Wall();
        addObject(wall46,230,258);
        Wall wall47 = new Wall();
        addObject(wall47,204,302);
        Wall wall48 = new Wall();
        addObject(wall48,199,345);
        Wall wall49 = new Wall();
        addObject(wall49,206,393);
        Wall wall50 = new Wall();
        addObject(wall50,260,417);
        Wall wall51 = new Wall();
        addObject(wall51,312,421);
        Wall wall52 = new Wall();
        addObject(wall52,353,376);
        Wall wall53 = new Wall();
        addObject(wall53,362,329);
        Win win = new Win();
        addObject(win,274,346);
        Player player = new Player();
        addObject(player,690,675);
        EnemyPurg enemyPurg = new EnemyPurg();
        addObject(enemyPurg,82,678);
        removeObject(wall53);
        removeObject(wall52);
        removeObject(wall51);
        removeObject(wall50);
        removeObject(wall49);
        removeObject(wall48);
        removeObject(wall47);
        win.setLocation(253,410);
        wall46.setLocation(202,251);
        removeObject(wall45);
        wall44.setLocation(383,285);
        WinPurg2 winPurg2 = new WinPurg2();
        addObject(winPurg2,255,366);
        removeObject(win);
        winPurg2.setLocation(242,408);
        wall9.setLocation(451,587);
        wall9.setLocation(414,602);
        wall10.setLocation(494,583);
        wall10.setLocation(481,604);
        wall10.setLocation(465,613);
        wall9.setLocation(415,627);
    }
}
