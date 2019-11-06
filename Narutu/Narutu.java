    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Narutu here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Narutu extends Actor
    {
        /**
         * Act - do whatever the Narutu wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        private int groundLevel = 430;
        private int jumpSpeed;
      
        private int count ;
        private int countheart =3;
        private boolean touching =false;
        public int frame = 0;
        int countIm =0;
        int count1=0;
        private final int GRAVITY = 1;
        private int velocity;
        private GreenfootImage[] tu = new GreenfootImage[21];
        public Narutu()
        {
            GreenfootImage image = getImage();
            image.scale(240, 180);
            setImage(image);
           
        }
    
        public void act() 
        { 
            animateF();
            //if(Greenfoot.isKeyDown("up") && getY() > getWorld().getHeight()-50)jump();
            controlKey();
            onGround();
            //jump();
           // hit();
           atk();
           
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
        
       private int speed = 12; 
        boolean jumpPressed = false;
        boolean cheatPressed = false;
        final int MAX_JUMP = 1;
        private int jumpCount;
        public void controlKey() {
            if (Greenfoot.isKeyDown("up")) {
                GreenfootSound Jump1 = new GreenfootSound("jump1.mp3");
                Jump1.play();
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
        
        public void gameOver()
        {
         Greenfoot.setWorld(new MAIN());   
        }
        public void atk(){
        if(getOneIntersectingObject(puqueen.class) != null ){
            World2.q--;
            checka++;
            if(checka<=25){
                
            }
        }
    }
      int checka = 0;
 
  }

    




        
        
        
    
