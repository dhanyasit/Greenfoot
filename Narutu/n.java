import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class n here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class n extends Actor
{

    /**
     * Act - do whatever the n wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Endless());
    }
    }    

    public n(){
        GreenfootImage image = getImage();
        image.scale(300,120);
        setImage(image);


    }
}
