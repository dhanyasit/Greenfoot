import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    GreenfootSound Slash1 = new GreenfootSound("slash1.mp3");
    int count = 0 ;
    public void act() 
    {
        count++;
        if(count>=20){
        getWorld().removeObject(this);
        count = 0;
        Slash1.play();
        }
    }    
    public Attack(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4,image.getHeight()*1/4);
        setImage(image);
    }
}
