import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bk extends Actor
{
    /**
     * Act - do whatever the bk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX()-8, getY());
        atk();
    }    

    public bk(){
        GreenfootImage image = getImage();
        image.scale(100,60);
        setImage(image);
    }     

    public void atk(){
        if((getOneIntersectingObject(tax.class) != null)){
            getWorld().removeObject(this); 
            World3.ultim+=1;
        }else if(this.getX() == 0){
            getWorld().removeObject(this); 
        }else if(getOneIntersectingObject(Narutu.class) != null ){
            getWorld().removeObject(this); 
            World3.t--;
        }
    }
}
