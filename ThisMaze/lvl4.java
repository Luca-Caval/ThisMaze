import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl4 extends World
{

    /**
     * Constructor for objects of class lvl4.
     * 
     */
    public lvl4()
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
        Player player = new Player();
        addObject(player,170,356);
        Enemy enemy = new Enemy();
        addObject(enemy,18,713);
        enemy.setLocation(27,355);
        Win4 win4 = new Win4();
        addObject(win4,684,349);
        Gate gate = new Gate();
        addObject(gate,593,348);
        Gate gate2 = new Gate();
        addObject(gate2,230,274);
        Gate gate3 = new Gate();
        addObject(gate3,232,420);
        Gate gate4 = new Gate();
        addObject(gate4,154,421);
        Gate gate5 = new Gate();
        addObject(gate5,79,421);
        Gate gate6 = new Gate();
        addObject(gate6,80,270);
        Gate gate7 = new Gate();
        addObject(gate7,231,494);
        Gate gate8 = new Gate();
        addObject(gate8,231,565);
        Gate gate9 = new Gate();
        addObject(gate9,229,636);
        Gate gate10 = new Gate();
        addObject(gate10,302,637);
        Gate gate11 = new Gate();
        addObject(gate11,375,638);
        Gate gate12 = new Gate();
        addObject(gate12,451,638);
        Gate gate13 = new Gate();
        addObject(gate13,523,638);
        Gate gate14 = new Gate();
        addObject(gate14,596,638);
        Gate gate15 = new Gate();
        addObject(gate15,594,567);
        Gate gate16 = new Gate();
        addObject(gate16,595,495);
        Gate gate17 = new Gate();
        addObject(gate17,594,420);
        Gate gate18 = new Gate();
        addObject(gate18,592,275);
        Gate gate19 = new Gate();
        addObject(gate19,591,203);
        Gate gate20 = new Gate();
        addObject(gate20,590,132);
        Gate gate21 = new Gate();
        addObject(gate21,584,3);
        Gate gate22 = new Gate();
        addObject(gate22,379,421);
        Gate gate23 = new Gate();
        addObject(gate23,306,273);
        Gate gate24 = new Gate();
        addObject(gate24,447,350);
        Gate gate25 = new Gate();
        addObject(gate25,372,210);
        Gate gate26 = new Gate();
        addObject(gate26,516,288);
        Gate gate27 = new Gate();
        addObject(gate27,441,147);
        Gate gate28 = new Gate();
        addObject(gate28,79,197);
        Gate gate29 = new Gate();
        addObject(gate29,79,122);
        Gate gate30 = new Gate();
        addObject(gate30,76,50);
        Gate gate31 = new Gate();
        addObject(gate31,150,49);
        Gate gate32 = new Gate();
        addObject(gate32,220,48);
        Gate gate33 = new Gate();
        addObject(gate33,292,49);
        Gate gate34 = new Gate();
        addObject(gate34,439,24);
        Gate gate35 = new Gate();
        addObject(gate35,377,492);

        Gate gate36 = new Gate();
        addObject(gate36,670,639);
        Gate gate37 = new Gate();
        addObject(gate37,809,637);
        Gate gate38 = new Gate();
        addObject(gate38,887,636);
        Gate gate39 = new Gate();
        addObject(gate39,811,559);
        Gate gate40 = new Gate();
        addObject(gate40,810,485);
        Gate gate41 = new Gate();
        addObject(gate41,809,411);
        Gate gate42 = new Gate();
        addObject(gate42,808,334);
        Gate gate43 = new Gate();
        addObject(gate43,805,262);
        Gate gate44 = new Gate();
        addObject(gate44,803,187);
        Gate gate45 = new Gate();
        addObject(gate45,798,118);
        Gate gate46 = new Gate();
        addObject(gate46,665,131);
        Gate gate47 = new Gate();
        addObject(gate47,730,261);
        Gate gate48 = new Gate();
        addObject(gate48,663,423);
        Gate gate49 = new Gate();
        addObject(gate49,809,707);
        Gate gate50 = new Gate();
        addObject(gate50,809,779);
        Gate gate51 = new Gate();
        addObject(gate51,809,851);
        Gate gate52 = new Gate();
        addObject(gate52,731,852);
        Gate gate53 = new Gate();
        addObject(gate53,657,853);
        Gate gate54 = new Gate();
        addObject(gate54,582,854);
        Gate gate55 = new Gate();
        addObject(gate55,518,854);
        Gate gate56 = new Gate();
        addObject(gate56,440,856);
        Gate gate57 = new Gate();
        addObject(gate57,358,855);
        Gate gate58 = new Gate();
        addObject(gate58,280,856);
        Gate gate59 = new Gate();
        addObject(gate59,202,857);
        Gate gate60 = new Gate();
        addObject(gate60,299,708);
        Gate gate61 = new Gate();
        addObject(gate61,442,784);
        Gate gate62 = new Gate();
        addObject(gate62,600,705);
        Gate gate63 = new Gate();
        addObject(gate63,154,628);
        Gate gate64 = new Gate();
        addObject(gate64,123,859);
        Gate gate65 = new Gate();
        addObject(gate65,51,799);
        Gate gate66 = new Gate();
        addObject(gate66,0,717);
        player.setLocation(301,345);
        gate23.setLocation(299,242);
        gate23.setLocation(296,240);
        gate25.setLocation(357,195);
        gate27.setLocation(432,130);
        gate34.setLocation(433,24);
        gate27.setLocation(415,140);
        gate34.setLocation(439,-5);
        gate34.setLocation(423,0);
        gate33.setLocation(307,15);
        gate32.setLocation(224,11);
        gate31.setLocation(157,6);
        gate30.setLocation(66,7);
        gate29.setLocation(74,73);
        gate28.setLocation(85,126);
        gate6.setLocation(82,208);
        gate60.setLocation(303,701);
        gate63.setLocation(153,651);
        gate65.setLocation(57,789);
        gate66.setLocation(7,744);
        gate66.setLocation(9,760);
        gate66.setLocation(8,765);
        gate66.setLocation(17,748);
    }
}
