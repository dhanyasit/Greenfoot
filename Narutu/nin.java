import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nin extends Actor
{
    /**
     * Act - do whatever the nin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atk();
        move(-10);
    }    
    public nin(){
        GreenfootImage image = getImage();
        image.scale(140,180);
        setImage(image);
    }
    
    public void atk(){
    if(getOneIntersectingObject(Attack.class) != null ||(getOneIntersectingObject(tax.class) != null)){
       getWorld().removeObject(this); 
       MyWorld.ultim+=1;
    }else if(this.getX() == 0){
        getWorld().removeObject(this); 
    }
    else if(getOneIntersectingObject(Narutu.class) != null ){
        getWorld().removeObject(this); 
        MyWorld.h--;
    }
}
}
