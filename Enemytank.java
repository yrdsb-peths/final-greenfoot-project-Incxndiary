import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemytank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemytank extends Actor
{
    /**
     * Act - do whatever the Enemytank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage enemy = new GreenfootImage("images/tank_idle/tile003.png");
    public Enemytank(){
        setRotation(90);
        enemy.scale(65,50);
        setImage(enemy);
    }
    public void act()
    {
        
    }
    
}
