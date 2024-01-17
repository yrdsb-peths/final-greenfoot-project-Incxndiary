import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemybullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemybullet extends SmoothMover
{
    /**
     * Act - do whatever the Enemybullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the characteristics of the bullet
    GreenfootImage enemybullet = new GreenfootImage("images/Bullet.png");
    public Enemybullet(int direction){
        setRotation(direction);
        setImage(enemybullet);
    }
    
    public void act()
    {
        //Speed
        move(50);
        //Checks if it touches the "good" tank
        MyWorld world = new MyWorld();
        if(removeObject()){
            getWorld().removeObject(this);
            
        }
        
        
    }
    //Removes bullet if it touches border
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
    
}
