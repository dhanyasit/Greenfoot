import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutuRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutuRun extends Actor
{
    /**
     * Act - do whatever the NarutuRun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count ;
    public int frame = 0;
    private final int GRAVITY = 1;
    private int velocity;
    private GreenfootImage[] tu = new GreenfootImage[21];
    public NarutuRun()
    {
        GreenfootImage image = getImage();
        image.scale(900, 600);
        setImage(image);
       
    }

  

   /* protected void addedToWorld(World world)
    {
        for (int i = 0; i < 21; i++) {
            tu[i] = new GreenfootImage("tu" + i + ".png");
            tu[i].scale(320, 250);
        }
    }
    
        public void animateF() 
        {   
        GreenfootImage image = getImage();
        setImage(tu[frame]);
        if (frame == 20) {
            frame = 0;
            return;
        }
        frame++;
    }
    
    public void jump()
    {
        velocity = -20;
    }
    
    public void fall()
    {
        setLocation (getX(), getY() +velocity);
        if(getY() > getWorld().getHeight() -50)velocity = 0;
        else velocity += GRAVITY;
    }
    */
}

