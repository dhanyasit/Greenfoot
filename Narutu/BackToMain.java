import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackToMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToMain extends Actor
{
    /**
     * Act - do whatever the BackToMain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MAIN());
    }
}
public BackToMain(){
        GreenfootImage image = getImage();
        image.scale(150,60);
        setImage(image);
    }    
}
