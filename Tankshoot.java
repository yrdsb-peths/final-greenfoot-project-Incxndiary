import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    GreenfootImage tankshoot = new GreenfootImage("images/tank_idle/tile006.png");
    Gametank tank = new Gametank();
    MouseInfo mouse = Greenfoot.getMouseInfo();
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
    public void turnToMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    public void shoot(){
        if(Greenfoot.mousePressed(null)){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
        }
    }
    public void location(){
        int tankX = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getX();
        int tankY = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getY();
        setLocation(tankX, tankY);
    }
}
