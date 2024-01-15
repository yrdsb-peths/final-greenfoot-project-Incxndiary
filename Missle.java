import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketeer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missle extends Enemy
{
    /**
     * Act - do whatever the Rocketeer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage missle = new GreenfootImage ("images/Missletank.png");
    public Missle(){
        counter = 0;
        health = 300;
        setImage(missle);
        reload = 5;
    }
    public void act()
    {
        // Add your action code here.
    }
}
