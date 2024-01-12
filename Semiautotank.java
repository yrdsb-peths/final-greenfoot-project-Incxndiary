import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semiauotank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semiautotank extends Enemy
{
    /**
     * Act - do whatever the Semiauotank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage semi = new GreenfootImage("images/Semitank.png");
    public Semiautotank(){
        health = 100;
        setImage(semi);
    }
    public void act()
    {

        if(!dead()){
            turntotank();
            collision();
        }else{
            getWorld().removeObject(this);
        }
    }
    private void shoot(){
        
    }
}
