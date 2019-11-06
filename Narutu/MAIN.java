import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MAIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MAIN extends World
{
    GreenfootSound myMusic = new GreenfootSound("MainMenu-Music.mp3");
    /**
     * Constructor for objects of class MAIN.
     * 
     */
    public MAIN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
        
    }
int count = 0;
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NarutuRun naruturun = new NarutuRun();
        addObject(naruturun,640,195);
        naruturun.setLocation(603,90);
        Narutumain narutumain = new Narutumain();
        addObject(narutumain,831,268);
        narutumain.setLocation(129,332);
        naruturun.setLocation(614,87);
        watchmain watchmain = new watchmain();
        addObject(watchmain,1040,232);
        watchmain.setLocation(1036,271);
        watchmain.setLocation(1049,274);
        Darktu darktu = new Darktu();
        addObject(darktu,928,208);
        darktu.setLocation(820,382);
        darktu.setLocation(1029,416);
        watchmain.setLocation(797,397);
        darktu.setLocation(1031,424);
        watchmain.setLocation(811,404);

        naruturun.setLocation(440,126);
        removeObject(naruturun);
        narutumain.setLocation(146,350);
        darktu.setLocation(1103,414);
        watchmain.setLocation(880,395);

        story story = new story();
        addObject(story,860,397);
        story.setLocation(607,314);
        story.setLocation(606,341);
        puqueen puqueen = new puqueen();
        addObject(puqueen,920,408);
        puqueen.setLocation(941,423);
        how how = new how();
        addObject(how,1009,215);
        how.setLocation(997,112);
        how.setLocation(996,106);
        n n = new n();
        addObject(n,629,408);
        n.setLocation(605,459);
    }
public void act(){
        if(count<2){
            music();
        }
        
    }
    public void music(){
        myMusic.play();
        if(Greenfoot.mouseClicked(story.class)){
            myMusic.stop();
        }
        else if(Greenfoot.mouseClicked(n.class)){
            myMusic.stop();
        }
        else if(Greenfoot.mouseClicked(how.class)){
            myMusic.stop();
        }
 
    }
}