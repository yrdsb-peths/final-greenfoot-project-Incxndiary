import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int health;
    public int buffer;
    
    
    public void location(){
        int tankX = ((Normalenemy) getWorld().getObjects(Normalenemy.class).get(0)).getX();
        int tankY = ((Normalenemy) getWorld().getObjects(Normalenemy.class).get(0)).getY();
        setLocation(tankX, tankY);
    }
    public void turntotank(){
        int tankX = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getX();
        int tankY = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getY();
        buffer++;
        if(buffer % 10 == 0){
            turnTowards(tankX, tankY);
        }
    }
    public void collision(){
        Actor normal = getOneIntersectingObject(Bullet.class);
        if(normal != null){
            health -= 100;
            if(health <= 0){
                getWorld().removeObject(this);
            }
        }
    }
    public boolean dead(){
        return health < 1;
    }
}
