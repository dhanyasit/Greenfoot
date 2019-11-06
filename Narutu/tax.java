import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tax extends Actor
{
    /**
     * Act - do whatever the tax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(12);
        if(this.getX()==1188){
            getWorld().removeObject(this);
        }
    }    
    public tax(){
        GreenfootImage image = getImage();
        image.scale(200,120);
        setImage(image);
    }
}
