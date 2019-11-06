import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ulti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ulti extends Actor
{
    GreenfootSound ThrowUlti = new GreenfootSound("Throw ulti.mp3");
    int count = 0;
    public void act() 
    {   
        count++;
        ThrowUlti.play();
        if(count==30 ){
            getWorld().removeObject(this);
        }
        else if(count>=31){
            count = 0;
        }
    }    
    public ulti(){
        GreenfootImage image = getImage();
        image.scale(1000,300);
        setImage(image);
    }
}
