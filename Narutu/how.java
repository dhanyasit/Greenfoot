import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class how here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class how extends Actor
{

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HowTo());
    }
}   

 

    public how(){
        GreenfootImage image = getImage();
        image.scale(300,120);
        setImage(image);
    }
}
