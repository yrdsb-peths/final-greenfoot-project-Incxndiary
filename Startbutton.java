import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @
 * 
 * @author (Allan) 
 *
 */
public class Startbutton extends Actor
{
    /**
     * Start button creation
     */
    public Startbutton(){
        GreenfootImage start = new GreenfootImage("Start.png");
        setImage(start);
        start.scale(200, 100);
    }
    
    public void act(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
}
