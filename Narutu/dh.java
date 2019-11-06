    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
    * Write a description of class dh here.
    * 
    * @author (your name) 
    * @version (a version number or a date)
    */
    public class dh extends Actor
    {
    /**
     * Act - do whatever the dh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
    if (getX() == 0) {
        getWorld().removeObject(this);
    }// Add your action code here.
    }    
    public dh(){
    
    GreenfootImage image = getImage();
    image.scale(120,100);
    setImage(image);
    }
    }
