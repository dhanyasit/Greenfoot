import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
GreenfootSound myMusic1 = new GreenfootSound("Stage1.mp3");
    int rockCounter = 0;
    int ninCounter =0;
    int woodCounter = 0;
    int witCounter= 0;
    int dhCounter= 0;
    static int count =0;
    public static int ultim = 0;
    public static int h = 10;
    boolean checkAtk = false;
    public static int bosshp = 200;
    int countAtk=0;
    GreenfootImage noHeart = new GreenfootImage("Heart3.png");
    Narutu narutu = new Narutu();
    heart heart1 = new heart();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void ShowText(){

        showText("power : "+ ultim ,120,90);
        showText("X : "+ h ,120,65);

    }

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
        
    }
    
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(narutu,691,125);
        narutu.setLocation(161,24);

        addObject(heart1,142,225);
        heart1.setLocation(69,44);
        

 
    }

    public void act(){
        Ultimate();
        GameOver();
        atk();
        Rock();
        nin();
        wood();
        wit();
        ShowText();
        music();
    }
    public void music(){
       if(myMusic1.isPlaying()== false){
            
            myMusic1.setVolume(50);
            myMusic1.play();
            
        }
    }

    public void Rock() {
        rockCounter++;
        if (rockCounter == 200 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 300 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 450 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 600 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 620 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 640 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 910 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 1105 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
        if (rockCounter == 1300 ) {
            rock rock = new rock();
            addObject(rock, getWidth(), 530);

        }
    }

    public void nin(){
        ninCounter++;
        if (ninCounter == 105 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 210 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 270 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 520 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 473);

        }
        if (ninCounter == 550 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 770) {

            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 810 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 1200 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
        if (ninCounter == 1070 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }if (ninCounter == 1360 ) {
            nin nin = new nin();
            addObject(nin, getWidth(), 472);

        }
    }

    public void wood(){
        woodCounter++;
        if (woodCounter == 60 ) {
            wood wood = new wood();
            addObject(wood, getWidth(), 530);

        }
        if (woodCounter == 160 ) {
            wood wood = new wood();
            addObject(wood, getWidth(), 530);

        }
        {if (woodCounter == 370 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
            if (woodCounter == 630 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
            if (woodCounter == 690 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
            if (woodCounter == 880 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
            if (woodCounter == 890 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
            if (woodCounter == 900 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }

            if (woodCounter == 1020 ) {
                wood wood = new wood();
                addObject(wood, getWidth(), 530);

            }
        }
    }

    public void wit(){
        witCounter++;
        if (witCounter > 1495  && bosshp > 0){
            showText("X : "+ bosshp ,1150,65);

        }
        if (witCounter == 1500 ){
            watch wit = new watch();
            addObject( wit, 1050 , 377); 
        }
        if (witCounter == 1600 ){
            free f = new free();
            addObject( f, 1055 , 114);
        }if (witCounter == 1620 ){
            wh wh = new wh();
            addObject( wh, 1050 , 377); 
        }
        if (witCounter == 1700 ){
            wh wh = new wh();
            addObject( wh, 1050 , 455); 
        }
        if (witCounter == 1710 ){
            wh wh = new wh();
            addObject( wh, 1050 , 407); 
        }if (witCounter == 1780 ){
            wh wh = new wh();
            addObject( wh, 1050 , 380); 

        }if (witCounter == 1960 ){
            free f = new free();
            addObject( f, 1055 , 114);
        }if (witCounter == 1970 ){
            wh wh = new wh();
            addObject( wh, 1050 , 457);
        }
        if (witCounter == 2050 ){
            wh wh = new wh();
            addObject( wh, 1050 , 457);
        }
        if (witCounter == 2055 ){
            wh wh = new wh();
            addObject( wh, 1050 , 467);
        }
        if (witCounter == 2100 ){
            wh wh = new wh();
            addObject( wh, 1050 , 407);
        }
        if (witCounter == 2125){
            wh wh = new wh();
            addObject( wh, 1050 , 407);
        }
        if (witCounter == 2170 ){
            wu wu = new wu();
            addObject( wu, 1050 , 407);
        }
        if (witCounter == 2440 ){
            free f = new free();
            addObject( f, 1055 , 114);
        }if (witCounter == 2450 ){
            wu wu = new wu();
            addObject( wu, 1050 , 407);
        }
        if (witCounter == 2500 ){
            wh wh = new wh();
            addObject( wh, 1050 , 407);
        }
        if (witCounter == 2555 ){
            wh wh = new wh();
            addObject( wh, 1050 , 407);
        }
        if (witCounter == 2590 ){
            wh wh = new wh();
            addObject( wh, 1050 , 407);
        }
        if (witCounter == 2600 ){
            wu wu = new wu();
            addObject( wu, 1050 , 407);
        }
        if (witCounter == 2650 ){
            wu wu = new wu();
            addObject( wu, 1050 , 407);
        }
        if (witCounter == 2675 ){
            wu wu = new wu();
            addObject( wu, 1050 , 407);
        }
        if(witCounter >= 2750){
            witCounter = 1520 ; 
        }
    }

    public void atk(){
        if(Greenfoot.isKeyDown("space")){
            Attack at = new Attack();
            addObject(at,narutu.getX()+230,narutu.getY()+25);
            checkAtk = true;
        }
    }

    public void Ultimate(){
        if( ultim >=3){
            if(Greenfoot.isKeyDown("c")){
                ulti m = new ulti();
                addObject(m,605,273);
                tax t  = new tax();
                addObject(t,0,450);
                ultim-=3;
            }
        }
    }

    public void GameOver(){
        if(h <=0){
            Greenfoot.setWorld(new MAIN());
            World3.t = 10;
            World2.q = 50;
            MyWorld.h = 10;
            ultim = 0;
            World2.ultim = 0;
            MyWorld.ultim = 0;
            MyWorld.bosshp = 200;
           
            myMusic1.stop();
        }
    }
}

