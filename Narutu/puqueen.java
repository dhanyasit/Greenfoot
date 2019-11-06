import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puqueen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puqueen extends Actor
{ int count = 0;
    public int k = 10;
    /**
     * Act - do whatever the puqueen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        atk();
    }    

    public void moveAround(){
        count++;

        if(count < 300){
            move(20);
            if(Greenfoot.getRandomNumber(100)<10){
                turn(Greenfoot.getRandomNumber(90)-45);
            }
            World world = getWorld();
            if(getX()<= 5||(getX() >= world.getWidth()-5)){
                turn(180);
            }
            if(getY()<= 5||(getY() >= world.getHeight()-5)){
                turn(180);
            }
        }
        if(count>=301){
            move(0);
            setLocation(966,406);
            setRotation(0);
        }
        if(count == 450){
            count = 0;
        }
    }

    public puqueen(){

        GreenfootImage image = getImage();
        image.scale(125,150);
        setImage(image);

    }
    public void atk(){
        
        if(getOneIntersectingObject(Attack.class) != null ){
            k--;
            World2.bosshp2--;
            
        }
        else if((getOneIntersectingObject(tax.class) != null)){
            k--;
            World2.bosshp2--; 
            GreenfootSound Hurt = new GreenfootSound("hurt2.mp3");
            Hurt.setVolume(60);
            
        }
        if(World2.bosshp2==0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new World3());
        }
    }
}

