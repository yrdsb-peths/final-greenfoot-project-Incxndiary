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
    public int fizzOut;
    public void act()
    {

    }
    //turn towards the game tank
    public void turntotank(){
        int tankX = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getX();
        int tankY = ((Gametank) getWorld().getObjects(Gametank.class).get(0)).getY();
        buffer++;
        if(buffer % 10 == 0){
            turnTowards(tankX, tankY);
        }
    }
    //Checks if the bullet intersects/hits the game tank
    public void collision(){

        Actor bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if(bullet != null){
            health -= 50;

        }
        if(health <= -1){
            getWorld().removeObject(this);

        }
    }
    //returns if dead
    public boolean dead(){
        return health <= 0;
    }
    

}
