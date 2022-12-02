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
        addObject(wall,25,578);
        Wall wall2 = new Wall();
        addObject(wall2,25,532);
        Wall wall3 = new Wall();
        addObject(wall3,25,486);
        Wall wall4 = new Wall();
        addObject(wall4,25,442);
        Wall wall5 = new Wall();
        addObject(wall5,25,397);
        Wall wall6 = new Wall();
        addObject(wall6,25,351);
        Wall wall7 = new Wall();
        addObject(wall7,25,305);
        Wall wall8 = new Wall();
        addObject(wall8,25,259);
        Wall wall9 = new Wall();
        addObject(wall9,25,213);
        Wall wall10 = new Wall();
        addObject(wall10,25,167);
        Win win = new Win();
        addObject(win,15,25);
        Wall wall11 = new Wall();
        addObject(wall11,25,120);
        Wall wall12 = new Wall();
        addObject(wall12,119,20);
        Wall wall13 = new Wall();
        addObject(wall13,167,21);
        Wall wall14 = new Wall();
        addObject(wall14,216,21);
        Wall wall15 = new Wall();
        addObject(wall15,265,21);
        Wall wall16 = new Wall();
        addObject(wall16,315,21);
        Wall wall17 = new Wall();
        addObject(wall17,366,21);
        Wall wall18 = new Wall();
        addObject(wall18,416,21);
        Wall wall19 = new Wall();
        addObject(wall19,465,22);
        Wall wall20 = new Wall();
        addObject(wall20,516,19);
        Wall wall21 = new Wall();
        addObject(wall21,566,20);
        Wall wall22 = new Wall();
        addObject(wall22,577,66);
        wall21.setLocation(566,30);
        wall18.setLocation(410,31);
        wall21.setLocation(564,23);
        wall20.setLocation(532,23);
        wall19.setLocation(488,22);
        wall19.setLocation(485,24);
        wall18.setLocation(430,22);
        wall17.setLocation(382,18);
        wall16.setLocation(333,17);
        wall15.setLocation(277,16);
        wall14.setLocation(228,15);
        wall13.setLocation(185,11);
        wall12.setLocation(139,9);
        Wall wall23 = new Wall();
        addObject(wall23,576,113);
        Wall wall24 = new Wall();
        addObject(wall24,576,157);
        Wall wall25 = new Wall();
        addObject(wall25,579,206);
        Wall wall26 = new Wall();
        addObject(wall26,578,252);
        Wall wall27 = new Wall();
        addObject(wall27,578,298);
        Wall wall28 = new Wall();
        addObject(wall28,578,346);
        Wall wall29 = new Wall();
        addObject(wall29,580,395);
        Wall wall30 = new Wall();
        addObject(wall30,579,445);
        Wall wall31 = new Wall();
        addObject(wall31,577,496);
        Wall wall32 = new Wall();
        addObject(wall32,575,547);
        wall32.setLocation(579,584);
        Wall wall33 = new Wall();
        addObject(wall33,579,584);
        Wall wall34 = new Wall();
        addObject(wall34,532,580);
        Wall wall35 = new Wall();
        addObject(wall35,485,579);
        Wall wall36 = new Wall();
        addObject(wall36,438,580);
        Wall wall37 = new Wall();
        addObject(wall37,388,579);
        Wall wall38 = new Wall();
        addObject(wall38,338,580);
        Wall wall39 = new Wall();
        addObject(wall39,288,580);
        Wall wall40 = new Wall();
        addObject(wall40,240,580);
        Wall wall41 = new Wall();
        addObject(wall41,188,578);
        Wall wall42 = new Wall();
        addObject(wall42,141,577);
        Wall wall43 = new Wall();
        addObject(wall43,91,579);
        wall.setLocation(57,577);
        Wall wall44 = new Wall();
        addObject(wall44,57,577);
        Player player = new Player();
        addObject(player,514,529);
        Enemy enemy = new Enemy();
        addObject(enemy,131,82);
        enemy.setLocation(60,73);
        player.setLocation(521,527);
        wall31.setLocation(573,523);
        wall24.setLocation(568,188);
        wall26.setLocation(571,236);
        wall27.setLocation(574,280);
        wall28.setLocation(570,322);
        wall29.setLocation(573,374);
        wall29.setLocation(573,412);
        wall29.setLocation(575,381);
        wall30.setLocation(573,423);
        wall31.setLocation(572,463);
        wall32.setLocation(571,496);
        wall33.setLocation(575,541);
        wall33.setLocation(575,582);
        wall32.setLocation(572,537);
        wall31.setLocation(569,496);
        wall30.setLocation(575,443);
        wall29.setLocation(568,381);
        wall24.setLocation(589,199);
        wall12.setLocation(113,25);
        wall13.setLocation(149,23);
        wall13.setLocation(202,23);
        wall14.setLocation(208,23);
        wall15.setLocation(254,17);
        wall12.setLocation(132,22);
        wall16.setLocation(271,14);
        wall16.setLocation(336,15);
        wall16.setLocation(357,19);
        wall16.setLocation(343,18);
        wall18.setLocation(366,16);
        wall19.setLocation(422,13);
        wall20.setLocation(456,11);
        wall21.setLocation(492,7);
        wall22.setLocation(532,6);
        wall23.setLocation(570,92);
        wall23.setLocation(586,19);
        wall24.setLocation(563,26);
        wall25.setLocation(555,95);
        wall16.setLocation(282,17);
        wall13.setLocation(210,20);
        wall13.setLocation(159,37);
        wall12.setLocation(128,21);
        wall13.setLocation(188,44);
        wall13.setLocation(209,40);
        wall13.setLocation(222,35);
        wall.setLocation(15,572);
        wall.setLocation(27,582);
        wall.setLocation(41,581);
        wall.setLocation(22,568);
        wall2.setLocation(17,560);
        wall3.setLocation(17,508);
        wall4.setLocation(10,473);
        wall5.setLocation(0,433);
        wall6.setLocation(5,416);
        wall7.setLocation(11,372);
        wall8.setLocation(25,322);
        wall9.setLocation(40,295);
        wall10.setLocation(36,260);
        wall9.setLocation(38,261);
        wall9.setLocation(31,274);
        wall8.setLocation(32,306);
        wall7.setLocation(28,315);
        wall8.setLocation(26,291);
        wall11.setLocation(20,205);
        wall42.setLocation(131,580);
        wall41.setLocation(170,581);
        wall40.setLocation(202,581);
        wall39.setLocation(252,578);
        wall38.setLocation(296,578);
        wall37.setLocation(356,579);
        wall36.setLocation(378,581);
        wall35.setLocation(408,582);
        wall33.setLocation(480,581);
        wall33.setLocation(511,580);
        wall32.setLocation(553,598);
        wall33.setLocation(488,584);
        wall33.setLocation(508,573);
        wall32.setLocation(518,574);
        wall32.setLocation(551,574);
        wall31.setLocation(578,598);
        wall30.setLocation(587,560);
        wall29.setLocation(570,528);
        wall28.setLocation(571,479);
        wall26.setLocation(565,425);
        wall26.setLocation(576,406);
        wall25.setLocation(568,361);
        wall22.setLocation(572,318);
        player.setLocation(491,489);
        wall23.setLocation(562,279);
        wall22.setLocation(581,239);
        wall20.setLocation(565,197);
        wall19.setLocation(580,165);
        wall20.setLocation(579,157);
    }
}
