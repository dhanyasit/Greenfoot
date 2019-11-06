import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class realprem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class realprem extends Actor
{  private int count ;
        public int frame = 0;
        private GreenfootImage[] rp = new GreenfootImage[6];
    /**
     * Act - do whatever the realprem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       animateF();
       setLocation(1120, 512);
        count ++;
        if (count == 250) {
            getWorld().removeObject(this);
        }
    }    
    public realprem()
        {
            GreenfootImage image = getImage();
            image.scale(320, 250);
            setImage(image);
           
        }
        protected void addedToWorld(World world)
        {
            for (int i = 0; i < 6; i++) {
                rp[i] = new GreenfootImage("prem" + i + ".png");
                rp[i].scale(320, 250);
            }
        }
            public void animateF() 
            {   
            GreenfootImage image = getImage();
            setImage(rp[frame]);
            if (frame == 5) {
                frame = 0;
                return;
            }
            frame++;
        }
}
