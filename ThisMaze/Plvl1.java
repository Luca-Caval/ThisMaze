import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plvl1 extends World
{

    /**
     * Constructor for objects of class Plvl1.
     * 
     */
    public Plvl1()
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

        EnemyPurg enemyPurg = new EnemyPurg();
        addObject(enemyPurg,58,697);
        EnemyPurg enemyPurg2 = new EnemyPurg();
        addObject(enemyPurg2,212,694);
        EnemyPurg enemyPurg3 = new EnemyPurg();
        addObject(enemyPurg3,396,696);
        EnemyPurg enemyPurg4 = new EnemyPurg();
        addObject(enemyPurg4,546,696);
        enemyPurg4.setLocation(661,696);
        enemyPurg3.setLocation(483,699);
        enemyPurg2.setLocation(262,696);
        enemyPurg.setLocation(66,703);
        Player player = new Player();
        addObject(player,364,311);
        WinPurg winPurg = new WinPurg();
        addObject(winPurg,358,105);
        Wall wall = new Wall();
        addObject(wall,361,183);
        Wall wall2 = new Wall();
        addObject(wall2,408,184);
        Wall wall3 = new Wall();
        addObject(wall3,455,185);
        Wall wall4 = new Wall();
        addObject(wall4,316,186);
        Wall wall5 = new Wall();
        addObject(wall5,269,186);
        Wall wall6 = new Wall();
        addObject(wall6,224,186);
        Wall wall7 = new Wall();
        addObject(wall7,227,21);
        Wall wall8 = new Wall();
        addObject(wall8,275,22);
        Wall wall9 = new Wall();
        addObject(wall9,321,22);
        Wall wall10 = new Wall();
        addObject(wall10,369,20);
        Wall wall11 = new Wall();
        addObject(wall11,412,21);
        Wall wall12 = new Wall();
        addObject(wall12,460,20);
        Wall wall13 = new Wall();
        addObject(wall13,506,20);
        Wall wall14 = new Wall();
        addObject(wall14,502,187);
    }
}
