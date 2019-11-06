import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class watch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class watch extends Actor
{
    /**
     * Act - do whatever the watch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count ;
    public int frame = 0;
    public int a = 10;
    private GreenfootImage[] wit = new GreenfootImage[8];
    public watch(){

        GreenfootImage image = getImage();
        image.scale(300,350);
        setImage(image);

    }

    public void act() { 
        move(0);
        animateF();
        atk();
    }

    protected void addedToWorld(World world) {
        for (int i = 0; i < 8; i++) {
            wit[i] = new GreenfootImage("Pravit" + i + ".png");
            wit[i].scale(300,350);
        }
    }

    public void animateF() {

        GreenfootImage image = getImage();
        setImage(wit[frame]);
        if (frame == 7) {
            frame = 0;
            return;
        }
        frame++;
    }

    public void atk(){
        if(getOneIntersectingObject(Attack.class) != null ){
            a--;
            MyWorld.bosshp--;
        }
        else if((getOneIntersectingObject(tax.class) != null)){
            a--;
            MyWorld.bosshp--;
        }
        if(MyWorld.bosshp==0){
            getWorld().removeObject(this);
            
            Greenfoot.setWorld(new World2());
            
        }
    }
}

