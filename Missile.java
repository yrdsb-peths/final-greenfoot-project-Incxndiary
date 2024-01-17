import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketeer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Enemy
{
    /**
     * Act - do whatever the Rocketeer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage missle = new GreenfootImage ("images/Missletank.png");
    //Sets charactersitics of missle tank
    public Missile(){
        score = 200;
        counter = 0;
        health = 200;
        setImage(missle);
        reload = 150;
    }
    public void act()
    {
        
        spawnbullet();
        //Checks if dead, otherwise turntotank() and collision();
        if(dead()){
            MyWorld score = (MyWorld) getWorld();
            score.increaseScore1();
            getWorld().removeObject(this);
            Greenfoot.setWorld(score);
        }else{
            turntotank();
            collision();


        }
    }
    //Method to spawn a bullet, with delay between 2 shots
    private void spawnbullet(){
        counter++;
        if(counter > reload){
            Enemymissle bullet = new Enemymissle(getRotation());
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
            counter = 0;
        }
    }
}
