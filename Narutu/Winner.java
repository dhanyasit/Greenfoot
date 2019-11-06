import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{
    GreenfootSound Win = new GreenfootSound("Winner.mp3");
    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 

        Win.play();
        Win.setVolume(0);
    }
    public void act(){
    Win.setVolume(60);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackToMain backtomain = new BackToMain();
        addObject(backtomain,548,370);
        backtomain.setLocation(570,301);
        backtomain.setLocation(587,301);

    }
}
