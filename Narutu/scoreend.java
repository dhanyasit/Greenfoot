import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreend extends World
{

    /**
     * Constructor for objects of class scoreend.
     * 
     */
    public scoreend()
    {    
       
        super(1200, 600, 1); 
        prepare();
    }

    public void showText()
    {
        Score score = new Score("Score : ");
        addObject(score,600,250);
    
    }

    public void act(){
        showText();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackToMain backtomain2 = new BackToMain();
        addObject(backtomain2,708,251);
        backtomain2.setLocation(598,389);
    }
}
