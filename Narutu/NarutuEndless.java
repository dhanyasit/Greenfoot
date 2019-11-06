import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NarutuEndless here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NarutuEndless extends Actor
{
    /**
     * Act - do whatever the NarutuEndless wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] tu = new GreenfootImage[21];
    public int frame = 0;
    private int groundLevel = 430;
    private int jumpSpeed;
    public NarutuEndless()
        {
            GreenfootImage image = getImage();
            image.scale(240, 180);
            setImage(image);
           
        }
    
    public void act() 
    {
        animateF();
        controlKey();
        onGround();
        running();
    }    
    
    protected void addedToWorld(World world)
        {
            for (int i = 0; i < 21; i++) {
                tu[i] = new GreenfootImage("tu" + i + ".png");
                tu[i].scale(240, 180);
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
        
         private int speed = 8; 
        boolean jumpPressed = false;
        boolean cheatPressed = false;
        final int MAX_JUMP = 1;
        private int jumpCount;
        public void controlKey() {
            if (Greenfoot.isKeyDown("up")) {
                if (!jumpPressed && jumpCount < MAX_JUMP) {
                    jump();
                    jumpPressed = true;
                    jumpCount++;
                }
            }
            else {
                jumpPressed = false;
            }
            if (Greenfoot.isKeyDown("right") ) {
                animateF();
                setLocation(getX()+speed, getY());
            }
            if (Greenfoot.isKeyDown("left") ){
                setLocation(getX()-speed, getY());
            }

            
            else {
                cheatPressed = false;
            }
        }
        
        public void onGround() {
            boolean onGround = (getY() == groundLevel);
    
            if (!onGround) { //during jump
                fall();
            }
            else {
                jumpCount = 0;
            }
        }
        
        
        public void fall() {
            jumpSpeed++; // add gravity
            setLocation (getX(), getY() + jumpSpeed); // falling faster
            if (getY() >= groundLevel) { // landed (reached ground level)
                setLocation(getX(), groundLevel); // set on ground
                //Greenfoot.getKey(); // clears any key pressed during jump
            }
        }
        
        public void jump() {
            jumpSpeed = -25; // add jump speed
            setLocation(getX(), getY() + jumpSpeed); // leave ground
        }
        
        public void gameOver()
        {
         Greenfoot.setWorld(new MAIN());   
         Score.score = 0;
        }
        
        public void running() {
        Score.score ++;
    }
}
