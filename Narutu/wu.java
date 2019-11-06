import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wu extends Actor
{
    /**
     * Act - do whatever the wu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
        
        atk();
    }    
    public wu(){

        GreenfootImage image = getImage();
        image.scale(140,200);
        setImage(image);

    } 
    public void atk(){
    if((getOneIntersectingObject(tax.class) != null)){
        getWorld().removeObject(this); 
        
    }else if(this.getX() == 0){
        getWorld().removeObject(this); 
    }else if(getOneIntersectingObject(Narutu.class) != null ){
        getWorld().removeObject(this); 
        MyWorld.h--;
    }
}
}
