import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{
    GreenfootSound myMusic3 = new GreenfootSound("Stage3.mp3");
    /**
     * Constructor for objects of class World3.
     * 
     */
    int treeCounter = 0;
    int dbCount = 0;
    int pomCounter =0;
    int dkCounter = 0;
    int dhCount = 0;
    int rpCount = 0;
     static int count =3;
    public static int ultim = 0;
    public static int t = 10;
    heart heart1 = new heart();
    
    public static int bosshp3 = 300;
    int countAtk=0;
    Narutu narutu3 = new Narutu();

    public World3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200,600, 1,false); 
        prepare();
        myMusic3.play();
        myMusic3.setVolume(0);
    }

    private void prepare(){
        
        addObject(heart1,142,225);
        heart1.setLocation(69,44);
        addObject(narutu3,691,125);
        narutu3.setLocation(161,24);
        
    }

    public void act(){
        Tree();
        pom();
        dk();
        Ultimate();
        GameOver3();
        atk();
        ShowText();
        myMusic3.setVolume(60);
    }
    public void ShowText(){

        showText("power : "+ ultim ,120,90);
        showText("X : "+ t ,120,65);
        
    }

    public void Tree(){
        treeCounter ++;
        if(treeCounter == 80){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter == 220 ){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter ==  340){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter ==  370){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter ==  640){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter == 690 ){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter ==  740){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }
        if(treeCounter == 1040 ){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }if(treeCounter == 1100){
            tree tree = new tree();
            addObject(tree,getWidth(),455);
        }

    }

    public void pom(){
        pomCounter++;
        if(pomCounter == 380){
            pom pom = new pom();
            addObject(pom,1120,512);  
        }
        if(pomCounter == 400){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 410){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 420){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 460){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 470){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 480){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 510){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 520){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 530){
            coin coin = new coin();
            addObject(coin,985,503);     
        } if(pomCounter == 540){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 550){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 600){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(pomCounter == 620){
            coin coin = new coin();
            addObject(coin,985,503);        
        }if(pomCounter == 770){
            pom pom = new pom();
            addObject(pom,1120,512);  
        } 
        if(pomCounter == 810){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 815){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 820){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 880){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 900){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 910){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 960){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 965){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 970){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(pomCounter == 1000){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
    }

    public void dk(){
        dkCounter++;
        if (dkCounter > 1195  && bosshp3 > 0){
            showText("X : "+ bosshp3 ,1150,65);
            
        }

        if(dkCounter==1200){
            Darktu dk = new Darktu();
            addObject(dk,1039,395);
        }
        if (dkCounter == 1210 ){
            free f = new free();
            addObject( f, 1050,200);

        }
        if(dkCounter==1220){
            bk bk = new bk();
            addObject(bk,931,488);
        }
        if(dkCounter==1230){
            bk bk = new bk();
            addObject(bk,931,488);
        }
        if(dkCounter==1240){
            bk bk = new bk();
            addObject(bk,931,488);
        }
        if(dkCounter==1280){
            bk bk = new bk();
            addObject(bk,931,488);
        }
        if(dkCounter==1290){
            bk bk = new bk();
            addObject(bk,931,488);
        } if(dkCounter==1330){
            bk bk = new bk();
            addObject(bk,931,488);
        }
        if(dkCounter==1350){
            bk bk = new bk();
            addObject(bk,931,488);
        } if(dkCounter==1360){
            bk bk = new bk();
            addObject(bk,931,488);
        } if(dkCounter==1400){
            bku bku = new bku();
            addObject(bku,931,488);
        } if (dkCounter == 1600){
            dkCounter = 1201;
        }
    }
    public void atk(){
        if(Greenfoot.isKeyDown("space")){
            Attack at = new Attack();
            addObject(at,narutu3.getX()+230,narutu3.getY()+25);
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
    public void GameOver3(){
        if(t <=0){
            Greenfoot.setWorld(new MAIN());
            t = 10;
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