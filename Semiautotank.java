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
    public Semiautotank(){
        score = 100;
        counter = 0;
        health = 100;
        setImage(semi);
        reload = 100;
    }
    public void act()
    {
        shoot();
        if(dead()){
            MyWorld score = (MyWorld) getWorld();
            System.out.println("dead");
            score.increaseScore();
            getWorld().removeObject(this);
            Greenfoot.setWorld(score);
        }else{
            turntotank();
            collision();


        }
    }
    private void shoot(){
        counter++;
        if(counter > reload){
            Enemybullet bullet = new Enemybullet(getRotation());
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
            counter = 0;
        }
    }
}
