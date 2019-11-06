import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sub1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sub1 extends Actor
{
    /**
     * Act - do whatever the sub1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX()-8, getY());
       atk();
    }    
    public sub1(){
    GreenfootImage image = getImage();
        image.scale(150,120);
        setImage(image);
    }   
     public void atk(){
    if((getOneIntersectingObject(tax.class) != null)){
        getWorld().removeObject(this); 
        World2.ultim+=1;
    }else if(this.getX() == 0){
        getWorld().removeObject(this); 
    }else if(getOneIntersectingObject(Narutu.class) != null ){
        getWorld().removeObject(this); 
        World2.q--;
    }
}
}
