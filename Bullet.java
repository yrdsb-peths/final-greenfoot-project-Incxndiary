import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends SmoothMover
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bullet = new GreenfootImage("images/Bullet.png");
    public Bullet(){
        setImage(bullet);
    }
    
    public void act()
    {
        move(100);
        MyWorld world = new MyWorld();
        
        if(removeObject()){
            getWorld().removeObject(this);
        }
        }
    public boolean removeObject(){
        if(getY() == getWorld().getHeight()-1){
            return true;
        }
        if(getX() == getWorld().getWidth()-1){
            return true;
        }
        if(getY() <= 0){
            return true;
        }
        if(getX() <= 0){
            return true;
        }
        return false;
        
    }
    public void increaseScore(){
        if(isTouching(Semiautotank.class)){
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
        
    }
}
