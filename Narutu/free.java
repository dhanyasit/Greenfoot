import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class free here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class free extends Actor
{
    /**
     * Act - do whatever the free wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    {
     count++;
    if (count == 8) {
        getWorld().removeObject(this);
    }
    }    
    public free(){
        GreenfootImage image = getImage();
    image.scale(80,140);
    setImage(image);
    }
}
