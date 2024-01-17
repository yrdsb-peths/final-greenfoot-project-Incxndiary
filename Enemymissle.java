import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemymissle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemymissle extends SmoothMover
{
    /**
     * Act - do whatever the Enemymissle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the image of the missle
    GreenfootImage missle = new GreenfootImage("images/Missle.png");
    public Enemymissle(int direction){
        setRotation(direction);
        missle.scale(100, 20);
        setImage(missle);
    }
    
    public void act()
    {
        //Speed of missle
        move(30);
        MyWorld world = new MyWorld();
        //Checks if it hits "good" tank
        if(removeObject()){
            getWorld().removeObject(this);
        }
        else if(isTouching(Gametank.class) && isTouching(Tankshoot.class)){
            getWorld().removeObject(this);
        }
    }
    //Removes when touches the boundary
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
