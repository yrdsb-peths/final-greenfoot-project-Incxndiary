import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class Tankshoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tankshoot extends Actor
{
    /**
     * Act - do whatever the Tankshoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Image of the barell
    private int counter = 0;
    GreenfootImage tankshoot = new GreenfootImage("images/tank_idle/tile006.png");
    Gametank tank = new Gametank();
    MouseInfo mouse = Greenfoot.getMouseInfo();
    GreenfootSound explosion = new GreenfootSound("sounds/Bulletexplosion.mp3");
    public Tankshoot(){
        setImage(tankshoot);
        tankshoot.scale(60,25);
        
    }    
    public void act()
    {
        turnToMouse();
        location();
        shoot();
    }
    //Turn towards mouse
    public void turnToMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    public void shoot(){
        //Buffer time
        counter++;
        if(Greenfoot.mousePressed(null) && counter > 40){
            counter = 0;
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            explosion.play();
            bullet.setRotation(getRotation());
        }
    }
    //Finds the location of the gametank and sets itself on the (x,y) coordinates
    public void location(){
        int tankX = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getX();
        int tankY = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getY();
        setLocation(tankX, tankY);
    }
}
