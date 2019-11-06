import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pom extends Actor
{
    /**
     * Act - do whatever the pom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    {
        setLocation(1120, 512);
        count ++;
        if (count == 250) {
            getWorld().removeObject(this);
        }
    }    
    public pom(){
    GreenfootImage image = getImage();
        image.scale(240,130);
        setImage(image);
    } 
}
