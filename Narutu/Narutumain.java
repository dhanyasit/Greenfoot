    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Narutumain here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Narutumain extends Actor
    {
        /**
         * Act - do whatever the Narutumain wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
     private int groundLevel = 420;
        private int jumpSpeed;
    
        private int count ;
        public int frame = 0;
        private final int GRAVITY = 1;
        private int velocity;
        private GreenfootImage[] tu = new GreenfootImage[21];
        public Narutumain()
        {
            GreenfootImage image = getImage();
            image.scale(560, 450);
            setImage(image);
           
        }
    
        public void act() 
        { 
            animateF();
            //if(Greenfoot.isKeyDown("up") && getY() > getWorld().getHeight()-50)jump();
            //controlKey();
            //onGround();
            //jump();
        }
    
        protected void addedToWorld(World world)
        {
            for (int i = 0; i < 21; i++) {
                tu[i] = new GreenfootImage("tu" + i + ".png");
                tu[i].scale(560, 450);
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
        
       /* public void jump()
        {
            velocity = -20;
        }
        
        public void fall()
        {
            setLocation (getX(), getY() +velocity);
            if(getY() > getWorld().getHeight() -50)velocity = 0;
            else velocity += GRAVITY;
        }
        
        public void move(){
            if(Greenfoot.isKeyDown("right")){
                move(8);
            }
            if(Greenfoot.isKeyDown("left")){
                move(-8);
                
            }
        }
        */
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
    
            //System.out.println(Greenfoot.isKeyDown("up"));
        }
    
        public void onGround() {
            boolean onGround = (getY() == groundLevel);
    
            if (!onGround) { //during jump
                fall();
            }
            else {
                jumpCount = 0;
            }
            /*else if ("space".equals(Greenfoot.getKey())) { // jump key detected
            jump();
            }*/
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
    }
