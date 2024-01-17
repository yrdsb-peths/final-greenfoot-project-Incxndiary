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
    //setting the normal tanks image
    public Semiautotank(){
        score = 100;
        counter = 0;
        health = 100;
        setImage(semi);
        reload = 100;
    }
    public void act()
    {
        //Spawns the bullet
        spawnbullet();
        //Checks of the tanks dead, otherwise, turntotank() and collision()
        if(dead()){
            MyWorld score = (MyWorld) getWorld();
            score.increaseScore();
            getWorld().removeObject(this);
            Greenfoot.setWorld(score);
        }else{
            turntotank();
            collision();


        }
    }
    //Class to set the spawns of a normal bullet
    private void spawnbullet(){
        counter++;
        if(counter > reload){
            Enemybullet bullet = new Enemybullet(getRotation());
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
            counter = 0;
        }
    }
}
