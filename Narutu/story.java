import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story extends Actor
{
   
    public void act() 
    {GreenfootSound myMusic = new GreenfootSound("MainMenu-Music.mp3");
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
            
        
            
            
            myMusic.stop();
       
    }
}
    public story(){
        GreenfootImage image = getImage();
        image.scale(300,120);
        setImage(image);
    }
}
