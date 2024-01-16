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
    public int score;
    public int health;
    public int buffer;
    public int counter;
    public int reload;
    public void act()
    {

    }

    public void location(){
        int tankX = ((Semiautotank) getWorld().getObjects(Semiautotank.class).get(0)).getX();
        int tankY = ((Semiautotank) getWorld().getObjects(Semiautotank.class).get(0)).getY();
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
        Actor bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if(bullet != null){
            health -= 10;

        }
        if(health <= -1){
            getWorld().removeObject(this);
        }
    }

    public boolean dead(){
        System.out.println(health);
        return health <= 0;
    }
}
