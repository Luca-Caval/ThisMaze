import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl5 extends World
{

    /**
     * Constructor for objects of class lvl5.
     * 
     */
    public lvl5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Gate gate = new Gate();
        addObject(gate,149,35);
        Gate gate2 = new Gate();
        addObject(gate2,148,105);
        Gate gate3 = new Gate();
        addObject(gate3,34,288);
        Gate gate4 = new Gate();
        addObject(gate4,106,288);
        Gate gate5 = new Gate();
        addObject(gate5,179,288);
        Gate gate6 = new Gate();
        addObject(gate6,249,288);
        Gate gate7 = new Gate();
        addObject(gate7,319,288);
        Gate gate8 = new Gate();
        addObject(gate8,318,217);
        Gate gate9 = new Gate();
        addObject(gate9,317,144);
        Gate gate10 = new Gate();
        addObject(gate10,531,104);
        Gate gate11 = new Gate();
        addObject(gate11,531,35);
        Gate gate12 = new Gate();
        addObject(gate12,387,288);
        Gate gate13 = new Gate();
        addObject(gate13,459,290);
        Gate gate14 = new Gate();
        addObject(gate14,528,290);
        Gate gate15 = new Gate();
        addObject(gate15,597,289);
        Gate gate16 = new Gate();
        addObject(gate16,599,356);
        Gate gate17 = new Gate();
        addObject(gate17,600,422);
        Gate gate18 = new Gate();
        addObject(gate18,599,489);
        Gate gate19 = new Gate();
        addObject(gate19,526,490);
        Gate gate20 = new Gate();
        addObject(gate20,454,489);
        Gate gate21 = new Gate();
        addObject(gate21,386,491);
        Gate gate22 = new Gate();
        addObject(gate22,317,492);
        Gate gate23 = new Gate();
        addObject(gate23,319,562);
        Gate gate24 = new Gate();
        addObject(gate24,322,634);
        Gate gate25 = new Gate();
        addObject(gate25,318,705);
        Gate gate26 = new Gate();
        addObject(gate26,316,774);
        Gate gate27 = new Gate();
        addObject(gate27,243,773);
        Gate gate28 = new Gate();
        addObject(gate28,172,772);
        Gate gate29 = new Gate();
        addObject(gate29,10,771);
        Gate gate30 = new Gate();
        addObject(gate30,6,699);
        Gate gate31 = new Gate();
        addObject(gate31,7,625);
        Gate gate32 = new Gate();
        addObject(gate32,3,549);
        Gate gate33 = new Gate();
        addObject(gate33,3,481);
        Gate gate34 = new Gate();
        addObject(gate34,168,623);
        Gate gate35 = new Gate();
        addObject(gate35,169,554);
        Gate gate36 = new Gate();
        addObject(gate36,163,485);
        Gate gate37 = new Gate();
        addObject(gate37,165,416);
        Gate gate38 = new Gate();
        addObject(gate38,165,345);
        Gate gate39 = new Gate();
        addObject(gate39,665,285);
        Gate gate40 = new Gate();
        addObject(gate40,664,212);
        Gate gate41 = new Gate();
        addObject(gate41,812,285);
        Gate gate42 = new Gate();
        addObject(gate42,875,286);
        Gate gate43 = new Gate();
        addObject(gate43,815,216);
        Gate gate44 = new Gate();
        addObject(gate44,812,142);
        Gate gate45 = new Gate();
        addObject(gate45,662,486);
        Gate gate46 = new Gate();
        addObject(gate46,734,487);
        Gate gate47 = new Gate();
        addObject(gate47,799,485);
        Gate gate48 = new Gate();
        addObject(gate48,870,652);
        Gate gate49 = new Gate();
        addObject(gate49,795,651);
        Gate gate50 = new Gate();
        addObject(gate50,717,651);
        Gate gate51 = new Gate();
        addObject(gate51,659,650);
        Gate gate52 = new Gate();
        addObject(gate52,577,710);
        Gate gate53 = new Gate();
        addObject(gate53,506,711);
        Gate gate54 = new Gate();
        addObject(gate54,387,804);
        gate51.setLocation(627,664);
        gate52.setLocation(584,680);
        gate53.setLocation(533,679);
        gate54.setLocation(385,776);
        gate53.setLocation(452,764);
        gate52.setLocation(542,655);
        gate50.setLocation(680,659);
        gate50.setLocation(714,656);
        gate52.setLocation(598,661);
        gate53.setLocation(495,640);
        Gate gate55 = new Gate();
        addObject(gate55,458,777);
        Gate gate56 = new Gate();
        addObject(gate56,532,780);
        Gate gate57 = new Gate();
        addObject(gate57,607,781);
        Gate gate58 = new Gate();
        addObject(gate58,680,785);
        Gate gate59 = new Gate();
        addObject(gate59,755,793);
        YouWin youWin = new YouWin();
        addObject(youWin,500,403);
        Player player = new Player();
        addObject(player,53,50);
        Enemy enemy = new Enemy();
        addObject(enemy,41,398);
        enemy.setLocation(43,860);

        gate51.setLocation(572,640);
        gate51.setLocation(638,653);
        gate54.setLocation(394,778);
        gate55.setLocation(431,786);
        gate56.setLocation(502,792);
        gate57.setLocation(608,787);
        gate58.setLocation(642,795);
        gate59.setLocation(761,798);
        gate50.setLocation(731,653);
        gate51.setLocation(660,651);
        gate52.setLocation(581,652);
        gate53.setLocation(518,651);
        gate58.setLocation(708,800);
        gate56.setLocation(532,784);
        gate55.setLocation(472,788);
        gate59.setLocation(766,794);
        gate58.setLocation(710,793);
        gate57.setLocation(644,778);
        gate56.setLocation(558,786);
        gate55.setLocation(474,783);
        gate57.setLocation(619,800);
    }
}
