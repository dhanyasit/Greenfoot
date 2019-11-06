import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darktu extends Actor
{
    private int count ;
    public int frame = 0;
    private GreenfootImage[] prem = new GreenfootImage[3];
    int o = 10;
    /**
     * Act - do whatever the Darktu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Darktu(){
        GreenfootImage image = getImage();
        image.scale(300,320);
        setImage(image);
    }

    public void act() 
    {
        animateF();
        atk();
    }    

    protected void addedToWorld(World world) {
        for (int i = 0; i < 3 ; i++) {
            prem[i] = new GreenfootImage("DarkTu" + i + ".png");
            prem[i].scale(300,350);
        }
    }

    public void animateF() {
        GreenfootImage image = getImage();
        setImage(prem[frame]);
        if (frame == 2) {
            frame = 0;
            return;
        }
        frame++;
    }

    public void atk(){
        if(getOneIntersectingObject(Attack.class) != null ){
            o--;
            World3.bosshp3--;
            
        }
        else if((getOneIntersectingObject(tax.class) != null)){
            o--;
            World3.bosshp3--;
            
        }
        if(World3.bosshp3==0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Winner());
            World3.t = 10;
            World2.q = 50;
            MyWorld.h = 10;
            World3.ultim = 0;
            World2.ultim = 0;
            MyWorld.ultim = 0;
            MyWorld.bosshp = 200;
            World2.bosshp2 = 100;
            World3.bosshp3 = 300;
        }
    }
}
