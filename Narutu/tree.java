import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends Actor
{
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-10, getY());
        atk();
    }    

    public tree(){
        GreenfootImage image = getImage();
        image.scale(140,260);
        setImage(image);
    } 

    public void atk(){
        if(getOneIntersectingObject(Attack.class) != null ||(getOneIntersectingObject(tax.class) != null)){
            getWorld().removeObject(this); 
            World3.ultim+=1;
        }else if(this.getX() == 0){
            getWorld().removeObject(this); 
        }
        else if(getOneIntersectingObject(Narutu.class) != null ){
            getWorld().removeObject(this); 
            World3.t--;
        }else if(getOneIntersectingObject(NarutuEndless.class) != null){
            getWorld().removeObject(this);
            Endless.h--;
        }
    }
}
