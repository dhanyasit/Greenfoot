import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prem extends Actor
{
    /**
     * Act - do whatever the Prem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private int count ;
    public int frame = 0;
    private GreenfootImage[] prem = new GreenfootImage[6];
    
    public Prem()
    {
        GreenfootImage image = getImage();
        image.scale(320, 250);
        setImage(image);
       
    }
    
    public void act() 
    {
        animateF();
    }    
    
    protected void addedToWorld(World world)
    {
        for (int i = 0; i < 6; i++) {
            prem[i] = new GreenfootImage("prem" + i + ".png");
            prem[i].scale(320, 250);
        }
    }
        public void animateF() 
        {   
        GreenfootImage image = getImage();
        setImage(prem[frame]);
        if (frame == 5) {
            frame = 0;
            return;
        }
        frame++;
    }
}
