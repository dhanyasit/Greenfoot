import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg3 extends Actor
{
    /**
     * Act - do whatever the bg3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    public bg3(){
      image = new GreenfootImage("wo3.jpg");
      image.scale(1200,600);
      setImage(image);
    }
    public void act()
    {
       setLocation( getX()-2, getY() );
       if( getX() < -image.getWidth()/2 ) {
           setLocation( image.getWidth() + image.getWidth()/2 - (-getX() - image.getWidth()/2), image.getHeight()/2);
        }
    }    
}
