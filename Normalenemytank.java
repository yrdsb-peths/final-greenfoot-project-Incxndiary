import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normalenemytank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normalenemytank extends Enemy
{
    /**
     * Act - do whatever the Normalenemytank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    
    GreenfootImage enemytank = new GreenfootImage("images/tank_idle/tile003.png");
    public Normalenemytank(){
        health = 100;
        setRotation(90);
        enemytank.scale(65,50);
        setImage(enemytank);
    }
    public void act()
    {
        collision();
        if(dead()){
            
            
        }
    }
    private void shoot(){
        
    }
}
