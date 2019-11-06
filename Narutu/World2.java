import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    GreenfootSound myMusic2 = new GreenfootSound("Stage2.mp3");
    int sub1Count = 0;
    int sub2Count = 0;
    int puCount= 0;
    int dhCount = 0;
    static int count =3;
    public static int ultim = 0;
    public static int q = 50;
    
    public static int bosshp2 = 100;
    int countAtk=0;
    GreenfootImage noHeart = new GreenfootImage("Heart3.png");
    Narutu narutu2 = new Narutu();
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
         myMusic2.play();
        myMusic2.setVolume(0);
    }

    public void act(){
        sub1();
        sub2();
        Pu();
        Ultimate();
        GameOver();
        atk();
        ShowText();
        myMusic2.setVolume(60);
    }

    public void ShowText(){

        showText("power : "+ ultim ,120,90);
        showText("X : "+ q ,120,65);

    }

    public void sub1(){
        sub1Count++;
        if (sub1Count == 80 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth() , 455); 
        }
        if (sub1Count == 200 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth(), 455); 
        }
        if (sub1Count == 280 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth() , 455); 
        }
        if (sub1Count == 500 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth() , 455); 
        }
        if (sub1Count == 700 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth(), 455); 
        }
        if (sub1Count == 840 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth() , 455); 
        }
        if (sub1Count == 960 ){
            sub1 sub = new sub1();
            addObject( sub, getWidth() , 455); 
        }
    }

    public void sub2(){
        sub2Count++;
        if (sub1Count == 140 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth() , 460); 
        }
        if (sub1Count == 350 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth() , 460); 
        }
        if (sub1Count == 440 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth() , 460); 
        }
        if (sub1Count == 600 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth(), 460); 
        }
        if (sub1Count == 900 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth() , 460); 
        }
        if (sub1Count == 1030 ){
            sub2 subb = new sub2();
            addObject( subb, getWidth() , 460); 
        }

    }

    public void Pu(){
        puCount++;
        if (puCount > 1195  && bosshp2 > 0){
            showText("X : "+ bosshp2 ,1150,65);
            
        }
        if(puCount == 1200){
            puqueen pu = new puqueen();
            addObject( pu, 966 , 406); 
        }
        if (puCount == 1590 ){
            free f = new free();
            addObject( f, 971,200);

        }
        if (puCount == 1601 ){
            puCount = 1201;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(narutu2,691,125);
        narutu2.setLocation(161,24);
      
        Attack at = new Attack();
        heart heart1 = new heart();
        addObject(heart1,142,225);
        heart1.setLocation(69,44);
    }

    public void atk(){
        if(Greenfoot.isKeyDown("space")){
            Attack at = new Attack();
            addObject(at,narutu2.getX()+230,narutu2.getY()+25);

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
        if(q <=0){
            Greenfoot.setWorld(new MAIN());
            World3.t = 10;
            World2.q = 50;
            MyWorld.h = 10;
            ultim = 0;
            World2.ultim = 0;
            MyWorld.ultim = 0;
            MyWorld.bosshp = 200;
            World2.bosshp2 = 100;
            World3.bosshp3 = 300;
        }
    }


}

