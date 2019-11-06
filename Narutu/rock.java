import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Actor
{
    private boolean touching;
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //checkTouch();
        //checkTouching();
        atk();
        //checkHit();
        move(-10);
   
        
}

    public rock(){
        touching =false;
        GreenfootImage image = getImage();
        image.scale(80,50);
        setImage(image);
    }
    
     public void checkTouch(){
        MyWorld world = (MyWorld)getWorld();
        Actor narutu = (Actor)world.getObjects(Narutu.class).get(0);
        if(Math.abs(narutu.getX() - getX()) <= 50 && touching)
        {
            if(Math.abs(narutu.getY() - getY()) <= 50)
            {
                touching = true;
                /*GreenfootSound _sound = new GreenfootSound("sound.mp3");
                _sound.setVolume(43);
                _sound.play();*/
                
            }
        }
    }
    
  

    public void atk(){
    if((getOneIntersectingObject(tax.class) != null)){
        getWorld().removeObject(this); 
        MyWorld.ultim+=1;
    }else if(this.getX() == 0){
        getWorld().removeObject(this); 
    }else if(getOneIntersectingObject(Narutu.class) != null ){
        getWorld().removeObject(this); 
        MyWorld.h--;
    }
}
   /* public void checkTouching(){
      MyWorld world = (MyWorld)getWorld();
       if(touching == false){
          if(getOneIntersectingObject(Narutu.class) != null){
           world.removeHeart();   
              touching =true;
           getWorld().removeObject(this);      
                  
          }
       }
      else{
          
       
    }
    
  }*/
  
   
}
    
    
    
    

