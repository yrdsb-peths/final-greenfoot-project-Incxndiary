import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemyshoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemyshoot extends Actor
{
    /**
     * Act - do whatever the Enemyshoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage enemyshoot = new GreenfootImage("images/tank_idle/tile007.png");
    Enemytank enemy = new Enemytank();
    private int buffer;
    public Enemyshoot(){
        setImage(enemyshoot);
        enemyshoot.scale(60,25);
    }
    public void act()
    {
        turntotank();
        
    }
    public void location(){
        int tankX = ((Enemytank) getWorld().getObjects(Enemytank.class).get(0)).getX();
        int tankY = ((Enemytank) getWorld().getObjects(Enemytank.class).get(0)).getY();
        setLocation(tankX, tankY);
    }
    public void turntotank(){
        int tankX = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getX();
        int tankY = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getY();
        buffer++;
        if(buffer % 10 == 0) turnTowards(tankX, tankY);
    }
}
