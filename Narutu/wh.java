import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wh extends Actor
{
    /**
     * Act - do whatever the wh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
        atk();
    }    
    public wh(){
        GreenfootImage image = getImage();
        image.scale(35,25);
        setImage(image);        
    }
    public void atk(){
    if((getOneIntersectingObject(tax.class) != null)){
        getWorld().removeObject(this); 
        MyWorld.ultim+=1;
    }else if(this.getX() == 0){
        getWorld().removeObject(this); 
    }else if(getOneIntersectingObject(Narutu.class) != null ){
        getWorld().removeObject(this); 
        MyWorld.h--;
    }
}
    }

