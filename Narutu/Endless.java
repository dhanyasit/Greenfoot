import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endless here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endless extends World
{
    GreenfootSound StageEtc = new GreenfootSound("StageETC.mp3");
    int treeCounter = 0;
    int dbCount = 0;
    int realPremCounter =0;
    int rpCount = 0;
    public static int h = 10;
    heart heart1 = new heart();
    NarutuEndless narutu3 = new NarutuEndless();

    /**
     * Constructor for objects of class Endless.
     * 
     */
    public Endless()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1200,600, 1,false); 
        prepare();
        StageEtc.play();
        StageEtc.setVolume(0);
    }
    
     public void showText()
     {
       showText("X : "+ h ,120,65);
       Score score = new Score("Score : ");
       addObject(score,1000, 50);
     }
    
    public void prepare()
    {
        addObject(heart1,142,225);
        heart1.setLocation(69,44);
        addObject(narutu3,691,125);
        narutu3.setLocation(161,24);
        h=10;
    }
    
    public void act(){
        Tree();
        realprem();
        GameOver();
        showText();
        StageEtc.setVolume(60);
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
        }if(treeCounter >=1101){
            treeCounter =0;
        }
      
    }
    
    public void realprem(){
        realPremCounter++;
        if(realPremCounter == 380){
            realprem rp = new realprem();
            addObject(rp,1120,512);  
        }
        if(realPremCounter == 400){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 410){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 420){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 460){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 470){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 480){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 510){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 520){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 530){
            coin coin = new coin();
            addObject(coin,985,503);     
        } if(realPremCounter == 540){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 550){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 600){
            coin coin = new coin();
            addObject(coin,985,503);        
        } if(realPremCounter == 620){
            coin coin = new coin();
            addObject(coin,985,503);        
        }if(realPremCounter == 770){
            realprem rp  = new realprem();
            addObject(rp,1120,512);  
        } 
        if(realPremCounter == 810){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 815){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 820){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 880){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 900){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 910){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 960){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 965){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 970){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter == 1000){
            coin coin = new coin();
            addObject(coin,985,503);        
        }
        if(realPremCounter >=1001){
            realPremCounter =0;
        }
    }
    
     public void GameOver(){
        if(h <=0){
            Greenfoot.setWorld(new scoreend());
            h=10;
        }
    }
}
