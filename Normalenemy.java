import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normalenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normalenemy extends Enemy
{
    /**
     * Act - do whatever the Normalenemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage enemyshoot = new GreenfootImage("images/tank_idle/tile007.png");
    Normalenemytank enemy = new Normalenemytank();
    private int buffer;
    
    public Normalenemy(){
        setImage(enemyshoot);
        enemyshoot.scale(60,25);
    }
    public void act()
    {
        turntotank();
        shoot();
    }
    public void shoot(){
        if(Greenfoot.mouseClicked(null)){
            Enemybullet bullet = new Enemybullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
        }
    }
}
