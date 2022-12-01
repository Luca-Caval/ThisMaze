import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
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
        //Bottom walls 
        //0, 45, 90, 35, 80, 25, 70, 15, 60, 05, 50,
        Wall1 wall1 = new Wall1();
        addObject(wall1,0,575);
        Wall1 wall2 = new Wall1();
        addObject(wall2,45,575);
        Wall1 wall3 = new Wall1(); 
        addObject(wall3,90,575);
        Wall1 wall4 = new Wall1();
        addObject(wall4,135,575);
        Wall1 wall15 = new Wall1();
        addObject(wall15,180,575);
        Wall1 wall16 = new Wall1();
        addObject(wall16,225,575);
        Wall1 wall17 = new Wall1();
        addObject(wall17,270,575);
        Wall1 wall18 = new Wall1();
        addObject(wall18,315,575);
        Wall1 wall19 = new Wall1();
        addObject(wall19,360,575);
        Wall1 wall110 = new Wall1();
        addObject(wall110,405,575);
        Wall1 wall111 = new Wall1();
        addObject(wall111,450,575);
        Wall1 wall112 = new Wall1();
        addObject(wall112,495,575);
        Wall1 wall113 = new Wall1(); 
        addObject(wall113,540,575);
        Wall1 wall114 = new Wall1(); 
        addObject(wall114,585,575);

       
        Wall1 wall115 = new Wall1();
        addObject(wall115,585,515);
        Wall1 wall116 = new Wall1();
        addObject(wall116,585,465);
        Wall1 wall117 = new Wall1();
        addObject(wall117,585,415);
        Wall1 wall118 = new Wall1();
        addObject(wall118,585,365);
        Wall1 wall119 = new Wall1();
        addObject(wall119,585,315);
        Wall1 wall120 = new Wall1();
        addObject(wall120,585,265);
        Wall1 wall121 = new Wall1();
        addObject(wall121,585,215);
        Wall1 wall122 = new Wall1();
        addObject(wall122,585,165);
        Wall1 wall123 = new Wall1();
        addObject(wall123,585,115);
        Wall1 wall124 = new Wall1();
        addObject(wall124,585,65);
        Wall1 wall125 = new Wall1();
        addObject(wall125,585,15);
    }
}
