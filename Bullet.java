import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends SmoothMover
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bullet = new GreenfootImage("images/Bullet.png");
    public Bullet(){
        setImage(bullet);
    }
    Tankshoot barrel = new Tankshoot();
    public void act()
    {
        move(10);
    }
}
