import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     public static int score = 0;
    
    public Score(String a){
        GreenfootImage board = new GreenfootImage(a + score / 10,20,Color.BLACK, Color.WHITE);
        setImage(board);
    }
    
    int boardCount = 0;
    public void act() 
    {
        if(boardCount == 1)
            getWorld().removeObject(this);
        else if(boardCount < 1)
            boardCount++;
    }    
}
