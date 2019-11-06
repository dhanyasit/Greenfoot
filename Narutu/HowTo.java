import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends World
{

    /**
     * Constructor for objects of class HowTo.
     * 
     */
    public HowTo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HowToPic howtopic = new HowToPic();
        addObject(howtopic,534,343);
        howtopic.setLocation(605,412);
        howtopic.setLocation(603,402);
        BackToMain backtomain = new BackToMain();
        addObject(backtomain,952,155);
        backtomain.setLocation(1064,175);
    }
}
